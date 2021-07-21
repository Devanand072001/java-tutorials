import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        System.out.println(fact(n));
    }

    private static int fact(int n) {
        if (n == 0){
            return 1;
        }
        return n * fact(n - 1);
    }
}
