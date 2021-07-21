public class Main {
    public static void main(String[] args)  {

        /*
         * encapsulation = the hidden or private class members can only accessed getters
         * and setters
         */
        Car carObject = new Car("ford", "figo", 2007);
        System.out.println(carObject.getManufacturer());
        System.out.println(carObject.getModel());
        System.out.println(carObject.getYear());
        System.out.println("\nafter setter");
        carObject.setYear(2008);
        carObject.setModel("aspire");
        System.out.println(carObject.getModel());
        System.out.println(carObject.getYear());
        carObject.setManufacturer("Mercedes");
    }
}
