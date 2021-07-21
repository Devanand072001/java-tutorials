import java.util.StringTokenizer;

public class Tokenizer {
    /**String tokenizer can be used to read CSV files */
    public static void main(String[] args)  {
        StringTokenizer st1 = new StringTokenizer("string tokenizer");//default delimiter is " "
        System.out.println("token count: " + st1.countTokens());
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }
        System.out.println("---------------------------");

        StringTokenizer st2 = new StringTokenizer("www.google.com", ".");
        System.out.println(st2.countTokens());
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        System.out.println("---------------------------");
        StringTokenizer st3 = new StringTokenizer("26-07-01", "-", true);// counts including delimiter
        System.out.println(st3.countTokens());

        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }
        System.out.println("----------------------");
        StringTokenizer stringTokenizer = new StringTokenizer("01-07-2001", "-", false);// excluding tokenizer
        System.out.println(stringTokenizer.countTokens());

    }
}
