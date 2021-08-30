package github.churchtao.structor.decorator;

public interface DataSource {

    byte[] readData();

    void writeData(byte[] data);

}
