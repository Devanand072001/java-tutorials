public class Main {
    public static void main(String[] args) {
        String str = "a1b2c3";
        int digit = 0;
        String c = "";
        String out = "";

        for (int i = 0; i < str.length(); i++) {
            boolean isAlpha = str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z';
            if (isAlpha) {
                c = Character.toString(str.charAt(i));
            } else {
                digit = Integer.parseInt(Character.toString(str.charAt(i)));
//                System.out.print(c.repeat(digit)); //inbuilt method
                out = out + c.repeat(digit);
//                System.out.print(repeat(c, digit));
            }
        }
        System.out.println(out);
    }

    public static String repeat(String str, int count) {
        String repeatedString = "";
        for (int i = 0; i < count; i++) {
            repeatedString = repeatedString + str;
        }
        return repeatedString;
    }
}
