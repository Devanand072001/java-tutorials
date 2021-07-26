import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter value");
        //read() gets input as string.
//         int num = reader.read();
//         System.out.println(num);
        System.out.println("Enter value: ");
        int number = Integer.parseInt(reader.readLine());
        System.out.println(number);
        System.out.println("Enter sentence: ");
        String string = reader.readLine();
        System.out.println(string);
    }
}
