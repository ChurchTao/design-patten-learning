package github.churchtao.structor.decorator.aop.compress;

import github.churchtao.structor.decorator.DataSource;
import github.churchtao.structor.decorator.aop.DataSourceDecorator;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class DataSourceCompressDecorator extends DataSourceDecorator {
    public DataSourceCompressDecorator(DataSource wrapDataSource) {
        super(wrapDataSource);
    }

    @Override
    public String readData() {
        String out = wrapDataSource.readData();
        try {
            byte[] unCompressData =  uncompress(out.getBytes());
            return new String(unCompressData);
        } catch (DataFormatException e) {
            e.printStackTrace();
        }
        return "null";
    }


    @Override
    public void writeData(String data) {
        byte[] compressData = compress(data.getBytes());
        wrapDataSource.writeData(new String(compressData));
    }


    public static byte[] compress(byte[] input) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Deflater compressor = new Deflater(1);
        try {
            compressor.setInput(input);
            compressor.finish();
            final byte[] buf = new byte[2048];
            while (!compressor.finished()) {
                int count = compressor.deflate(buf);
                bos.write(buf, 0, count);
            }
        } finally {
            compressor.end();
        }
        return bos.toByteArray();
    }

    public static byte[] uncompress(byte[] input) throws DataFormatException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Inflater decompressor = new Inflater();
        try {
            decompressor.setInput(input);
            final byte[] buf = new byte[2048];
            while (!decompressor.finished()) {
                int count = decompressor.inflate(buf);
                bos.write(buf, 0, count);
            }
        } finally {
            decompressor.end();
        }
        return bos.toByteArray();
    }
}
