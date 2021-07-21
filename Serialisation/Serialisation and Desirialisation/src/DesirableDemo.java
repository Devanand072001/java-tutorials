import java.io.*;

/*
Deserialization = 	The reverse process of converting a byte stream into an object.
				(Think of this as if you're loading a saved file)
Steps to Deserialize
 ---------------------------------------------------------------
 1. Your class should implement Serializable interface
 2. add import java.io.Serializable;
 3. FileInputStream fileIn = new FileInputStream(file path);
 4. ObjectInputStream in = new ObjectInputStream(fileIn);
 5. objectNam = (Class) in.readObject();
 6. in.close();
 7.fileIn.close();
*/
public class DesirableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInput = new FileInputStream("data.ser");
        ObjectInputStream in = new ObjectInputStream(fileInput);
        Data data = (Data) in.readObject();
        in.close();
        fileInput.close();
        System.out.println();

        System.out.println("deserialization successful");
        System.out.println("name " + data.name);
        System.out.println("age " + data.age);
        System.out.println("transient address "+data.address);
        System.out.println("serial version "+ ObjectStreamClass.lookup(data.getClass()).getSerialVersionUID());

    }
}
