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
    public String readData() {
        String read = wrapDataSource.readData();
        String out = new String(Base64.getDecoder().decode(read));
        return out;
//        return wrapDataSource.readData();
    }

    @Override
    public void writeData(String data) {
        String based = new String(Base64.getEncoder().encode(data.getBytes()));
        wrapDataSource.writeData(based);
//        wrapDataSource.writeData(data);
    }
}
