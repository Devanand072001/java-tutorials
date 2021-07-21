package Package2;

import Package1.A;

public class Asub extends A {
    public static void main(String[] args) {
        A a = new A();
//        default variable cannot be accessed outside the package
//        System.out.println(a.defaultVar);

//      public variable can be accessed anywhere inside the project folder.
        System.out.println(a.publicVar);


        Asub asub = new Asub();
//        default variable cannot be accessed by subclass outside the package
//        System.out.println(asub.defaultVar);

        //public can be accessed by the subclass inside any package.
        System.out.println(asub.publicVar);

//protected variable can be accessed only within the package or subclass.
        System.out.println(asub.protectedVar);

        //private variable can be accessed only within the class of declaration.
        //System.out.println(asub.privateVar);
    }
}
