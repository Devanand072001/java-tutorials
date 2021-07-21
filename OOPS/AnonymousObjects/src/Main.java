public class Main {
    /*
    * Instance of class with out object declaration is
    *   called anonymous objects.
    * */
    public static void main(String[] args) {
        int area = new Area(5).area();
        int perimeter = new Area(6).perimeter();
        System.out.println("Area of square of side " + new Area(5).displaySide() + " is " + area);
        System.out.println("Perimeter of square " + new Area(6).displaySide() + " is " + perimeter);
    }
}
