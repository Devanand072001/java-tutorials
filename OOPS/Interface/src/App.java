public class App {
    public static void main(String[] args)  {
        /*
         * interface: 1.the template applied to a class. 2.similar to inheritance.
         * 3.specifies what a class can do. 4.classes can apply more than one
         * interfaces. Inheritance is limited to one super class.
         */

        Dog dog = new Dog();
        Cat cat = new Cat();
        Rat rat = new Rat();
        dog.chase();
        cat.run();
        cat.chase();
        rat.run();

    }
}
