public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting(){
            @Override
            public void displayMessage() {
               /* super.displayMessage();*/
                System.out.println("Hello world");
            }
        };

        greeting.displayMessage();

        Greeting greeting1 = new Greeting();
        greeting1.displayMessage();
    }
}
