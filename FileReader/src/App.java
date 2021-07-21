import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            FileReader fileReader = new FileReader("fileReaderSample.txt");
            int fileData = fileReader.read();
            while (fileData != -1) {
                System.out.print((char) fileData);
                fileData = fileReader.read();
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}
