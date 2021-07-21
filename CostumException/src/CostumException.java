import java.util.Scanner;

public class CostumException {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        try{
            checkAge(age);
        }catch (Exception e) {
            /*e.printStackTrace();*/
            System.out.println(e);
            System.err.println(e);
        }
    }

    private static void checkAge(int age) throws AgeException {
        if (age < 18){
            throw new AgeException("Access denied. you must be \uD83D\uDD1E");
        }
        else {
            System.err.println("Access granted..");
        }
    }
}
