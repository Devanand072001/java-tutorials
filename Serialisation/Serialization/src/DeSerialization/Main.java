package DeSerialization;

import java.io.*;

/*
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
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileIn;
        fileIn = new FileInputStream("UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        User user = (User) in.readObject();
        in.close();
        fileIn.close();

        /*
        *
         long serialVersionUID =
         ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
         System.out.println("serialVersionUID: "+serialVersionUID);
        */

        if (user != null) {
            System.out.println("name: " + user.name);
            System.out.println("password: " + user.password);
            user.hello();
        }




    }
}
