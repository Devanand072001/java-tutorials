
// import java.io.FileWriter;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("fileWriterSample.txt");
            fileWriter.write("people though again people again won't don't people");
            fileWriter.append("\ndiffed");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
