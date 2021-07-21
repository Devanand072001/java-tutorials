import java.util.stream.Stream;

public class Problem3 {
    public static void main(String[] args) {
        String str = "aaaabbbccc";
        String out = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
//            System.out.print(str.charAt(i) + Integer.toString(count));
            out += Character.toString(str.charAt(i)) + Integer.toString(count);

        }
        System.out.println(out);
    }
}
