package github.churchtao.structor.decorator;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileDataSource implements DataSource{

    private String filename;

    private File file;

    public FileDataSource(String filename) {
        this.filename = filename;
        this.file = new File(filename);
    }

    @Override
    public String readData() {
        try {
            StringBuilder builder = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(this.file)));
            String line = bufferedReader.readLine();
            while (line!=null){
                builder.append(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            return builder.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "null";
    }

    @Override
    public void writeData(String data) {
        try {
            PrintWriter fileWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.file))));
            fileWriter.write(data);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
