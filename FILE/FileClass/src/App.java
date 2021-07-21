import java.io.*;

public class App {
    public static void main(String[] args) throws Exception, IOException {

        // File file = new File("sample.txt");

        // var path = file.getPath();
        // System.out.println("Path: " + path);
        // if (file.exists()) {
        // System.out.println("file exist");
        // System.out.println(file.getAbsolutePath());
        // } else {
        // System.out.println("file does not exist");
        // }

        try {

            FileReader fileReader = new FileReader("eagle.txt");
            int fileData = fileReader.read();

            while (fileData != -1) {
                System.out.print((char) fileData);
                fileData = fileReader.read();
            }
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
