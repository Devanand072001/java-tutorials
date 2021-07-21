import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));

    }
    private static int fibonacci(int n){
        if (n <=1 ){
            /*System.out.print(n);*/
            return n;
        }
        else {
            return fibonacci(n -1 ) + fibonacci( n -2 );
        }
    }
}
