package SeirializationBroCode;


import java.io.Serializable;

public class User implements Serializable{
    /**
     *
     */

    @java.io.Serial
    private static final long serialVersionUID = 3309581618772213993L;
    String userName;
    String password;

    void sayHello() {
        System.out.println("hello " + userName);
    }
}

