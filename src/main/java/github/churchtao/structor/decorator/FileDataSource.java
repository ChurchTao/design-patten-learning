package github.churchtao.structor.decorator;

import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public final class FileDataSource implements DataSource{

    private String filename;

    private File file;

    public FileDataSource(String filename) {
        this.filename = filename;
        this.file = new File(filename);
    }

    @Override
    public byte[] readData() {
        FileChannel fc = null;
        try {
            fc = new RandomAccessFile(filename, "r").getChannel();
            MappedByteBuffer byteBuffer = fc.map(FileChannel.MapMode.READ_ONLY, 0,
                    fc.size()).load();
            System.out.println(byteBuffer.isLoaded());
            byte[] result = new byte[(int) fc.size()];
            if (byteBuffer.remaining() > 0) {
                byteBuffer.get(result, 0, byteBuffer.remaining());
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fc!=null){
                try {
                    fc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public void writeData(byte[] data) {
        try {
            File f = this.file;
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(data);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
