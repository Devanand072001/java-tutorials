public class Split {
    public static void main(String[] args) {
        String sentence = "https://www.youtube.com/split";
        String[] str = sentence.split(
                ":|\\//" +
                        "|\\." +
                        "|\\/"
        );// split can be used for using multiple delimiters
        for (int i = 0; i < str.length; i++) {
            String word = str[i];
            System.out.println(word);
        }

        System.out.println("=======================");
        for (String string : str) {
            if (!string.equals("")) {
                System.out.println(string);
            }
        }
    }

}
