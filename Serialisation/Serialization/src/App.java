import java.io.*;

/*serialisation = process of converting object into bytes stream.
                 saves the state of the program after exiting.
                 The stream can be saved as a file or sent over network (one machine to other).
                 The byte stream can be saved as file (.ser) which platform independent
                 (storing  the information about the object)
*/
/* deserialistion = the process of converting byte stream int object(loading the saved file ) */
public class App {

    public static void main(String[] args)  {
        Employee employee = new Employee();
        employee.name = "Devanand";
        employee.address = "Namakkal";

        try {
            FileOutputStream fileOutput = new FileOutputStream("sample.txt");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(employee);
            objectOutput.close();
            fileOutput.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
