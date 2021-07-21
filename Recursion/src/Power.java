import java.util.Random;


public class Power {
    public static void main(String[] args) {
        int base = new Random().nextInt(10);
        int exponent = new Random().nextInt(10);
        System.out.println("base: " + base);
        System.out.println("exponent: " + exponent);
        System.out.println("power: " + power(base, exponent));
    }

    private static int power(int base, int exponent) {
        if (exponent < 1) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
}
