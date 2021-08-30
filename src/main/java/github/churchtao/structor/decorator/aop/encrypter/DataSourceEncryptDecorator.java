package github.churchtao.structor.decorator.aop.encrypter;

import github.churchtao.structor.decorator.DataSource;
import github.churchtao.structor.decorator.aop.DataSourceDecorator;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class DataSourceEncryptDecorator extends DataSourceDecorator {
    public DataSourceEncryptDecorator(DataSource wrapDataSource) {
        super(wrapDataSource);
    }

    @Override
    public byte[] readData() {
        byte[] read = wrapDataSource.readData();
        return Base64.getDecoder().decode(read);
    }

    @Override
    public void writeData(byte[] data) {
        byte[] based = Base64.getEncoder().encode(data);
        wrapDataSource.writeData(based);
    }
}
