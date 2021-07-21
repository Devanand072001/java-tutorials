public class StaticMembers {
    /*
     * We can create static variables at class-level only.
     * static block and static variables are executed in order they are present in a program.
     */
    //static variables/ global variables
    static int a = 10;
    static int b;
    //static block
    static {
            System.out.println("The static block is always executed first");
    }

    public static void main(String[] args) {
        System.out.println("This main block");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
