public class Problem2 {
    public static void main(String[] args) {
        String str = "aaaabbbccc";
        String out = "";
        for (char i = 'a'; i <= 'z'; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (i == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 0) {
                out = out+ i + Integer.toString(count);
            }
        }
        System.out.println(out);
    }
}
