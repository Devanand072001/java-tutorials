import java.io.Serializable;



public class Data implements Serializable {
    /**
     *SerialVersionUID =	serialVersionUID is a unique ID that functions like a version #
     verifies that the sender and receiver of a serialized object,
     have loaded classes for that object that are compatible
     Ensures object will be compatible between machines
     Number must match. otherwise this will cause a InvalidClassException
     A SerialVersionUID will be calculated based on class properties, members, etc.
     A serializable class can declare its own serialVersionUID explicitly (recommended)
     */
    static final long serialVersionUID = -8570748635766976123L;


    public String name;
    public int age;
    transient String address;

    void serialHello() {
        System.out.println("serial version: "+serialVersionUID);
        System.out.println("name: " + name);
        System.out.println("age: " + age);

    }
}
/*
* * important notes:
  1. children classes of a parent class that implements Serializable will do so as well
  2. static fields are not serialized (they belong to the class, not an individual object)
  3. Fields declared as "transient" aren't serialized, they're ignored
  4. the class's definition ("class file") itself is not recorded, cast it as the object type
  5. serialVersionUID is a unique version ID */

