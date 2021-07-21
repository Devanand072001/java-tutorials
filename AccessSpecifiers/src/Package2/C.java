package Package2;

import Package1.A;

public class C {

    public static void main(String[] args) {
        A a = new A();
        //default variable cannot be accessed outside the package
       // System.out.println(a.defaultVar);

        //public variable can be accessed anywhere inside the project folder.
        System.out.println(a.publicVar);

//        //protected variable can be accessed only within the package or subclass.
//        System.out.println(a.protectedVar);

        /*System.out.println(a.getPrivateVar());
        System.out.println(a.getProtectedVar());*/
    }
}
