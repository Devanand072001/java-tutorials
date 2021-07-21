public class App {
    public static void main(String[] args)  {
        /*
         * polymorphism = greek word for poly-"many", morph-"form" The ability of an,
         * object to identify as more than one type. occurs when a parent class
         * reference is used to refer to a child class object.
         */
        Car car = new Car();
        Bike bike = new Bike();
        Cycle cycle = new Cycle();

        Vehicle[] racer = { car, bike, cycle };

        for (int i = 0; i < racer.length; i++) {
            racer[i].go();

        }

        // for (Vehicle vehicle : racer) {
        //     vehicle.go();
        // }
    }
}
