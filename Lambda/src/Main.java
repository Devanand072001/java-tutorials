public class Main {
    /*
     * lambda expression =
     *       is an anonymous method ,
     *       It is a shorter way to create a anonymous class
     *        one method.
     *       (arguments) ->{statements} */
    public static void main(String[] args) {
        new MyFrame();

        String name = "Devanand";
        char symbol = '!';
      /*MyInterface myInterface = new MyInterface(){

            @Override
            public void message() {
                System.out.println("Hello wold");
            }

          @Override
          public void message(String name, char symbol) {

          }
      };
      myInterface.message();*/

        MyInterface myInterface1 = (x, y) -> {
            System.out.println("Hello world");
            System.out.println("Have a nice day " + x + y);
        };
        myInterface1.message(name, symbol);
    }
}
