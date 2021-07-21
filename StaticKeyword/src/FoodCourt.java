public class FoodCourt {
    public static int noOfItems;
    public static int globalVariable = 0;
    int number;
    String food;

    public FoodCourt(String food) {
        this.food = food;
        noOfItems++;
        globalVariable++;
    }

    static {
        System.out.println("This is a static block, executed first");
    }

    /*When a member is declared static, it can be accessed
    before any objects of its class are created,
     and without reference to any object.*/
    public static void displayNo() {
        System.out.println("No of items ordered = " + noOfItems);
    }
}
