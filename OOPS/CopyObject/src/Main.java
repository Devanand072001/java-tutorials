public class Main {
    public static void main(String[] args) throws Exception {

        Car car1 = new Car("Ford", "Figo", 2012);

        /*
         * Car car2 = new Car("Maruthi", "dezire", 2017); car2.carCopy(car1); //or
         */

        Car car2 = new Car(car1);

        carMethod.carMethods(car1, car2);

    }
}
