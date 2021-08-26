package github.churchtao.structor.decorator;

import github.churchtao.structor.decorator.aop.compress.DataSourceCompressDecorator;
import github.churchtao.structor.decorator.aop.encrypter.DataSourceEncryptDecorator;

public class DecoratorMain {

    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource("/Users/church/Desktop/data.txt");
        dataSource = new DataSourceEncryptDecorator(dataSource);
//        dataSource = new DataSourceCompressDecorator(dataSource);
        String out = dataSource.readData();
        System.out.println(out);
        dataSource.writeData("tjc159753");
        String out2 = dataSource.readData();
        System.out.println(out2);
    }
}
