public class carMethod {

    static void carMethods(Car car1, Car car2) {
        System.out.println("car1: " + car1);
        System.out.println("car2: " + car2);
        System.out.println("car1 man: " + car1.getManufacturer());
        System.out.println("car1 model: " + car1.getModel());
        System.out.println("ca1 year: " + car1.getYear());
        System.out.println("----------------------------------");
        System.out.println("car2 man:" + car2.getManufacturer());
        System.out.println("car2 model: " + car2.getModel());
        System.out.println("car2 year: " + car2.getYear());
    }

}
