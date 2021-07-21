import java.util.Scanner;

public class Recursion {
    //a method calls itself
    //eg. factorials, fibonacci series, tree traversing.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance to walk: ");
        int distance = scanner.nextInt();

        takeAStep(0, distance);
    }
    static void takeAStep(int start, int distance){
        if (start < distance){

            int remaining = distance - start;
            System.out.println("You can step ahead " + remaining + "meters remaining" );
            start++;
            takeAStep(start, distance);
        }
        else {
            System.out.println("Mission success, finished walking "+distance+ "meters");
        }

    }
}
