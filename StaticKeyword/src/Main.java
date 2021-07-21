public class Main {
    /*static modifier:
     *   A single copy of variable or method is created and
     *   accessed from other class without creating the instance
     *   of the owner class.
     *   It can be directly accessed by the class name.
     *   It is method of declaring global variable.*/
    public static void main(String[] args) {
        FoodCourt pizza = new FoodCourt("Pizza");
        FoodCourt hamburger = new FoodCourt("Hamburger");
        FoodCourt sandwich = new FoodCourt("Sandwich");
        FoodCourt noodles = new FoodCourt("Noodles");

        System.out.println("No of Items ordered: " + FoodCourt.noOfItems);
        FoodCourt.displayNo();
    }
}
