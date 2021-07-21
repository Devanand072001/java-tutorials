package SeirializationBroCode;

import java.io.*;

/* Steps to Serialize:
  ---------------------------------------------------------------
  1. Your class should implement Serializable interface
  2. add import java.io.Serializable;
  3. FileOutputStream fileOut = new FileOutputStream(file path)
  4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
  5. out.writeObject(objectName)
  6. out.close(); fileOut.close();
  ---------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) throws IOException {
        User userObject;
        userObject = new User();
        userObject.userName = "devanand";
        userObject.password = "123";
        userObject.sayHello();

        FileOutputStream fileOutput = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOutput);
        objectOut.close();
        fileOutput.close();
        /* delclare in try catch or delclare IOExeption in main method */
        System.out.println(objectOut);
        System.out.println("user info saved sucessfully");

    }
}

