package Package1;

public class B {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.defaultVar);
        System.out.println(a.publicVar);
        System.out.println(a.protectedVar);
        //private var can be accessed only within the class
        //System.out.println(a.privateVar);

        //System.out.println(a.getPrivateVar());
    }
}
