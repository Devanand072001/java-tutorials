import java.util.Scanner;

public class PalindromeInSentence {
    public static void main(String[] args) {
        Scanner sentenceScanner = new Scanner(System.in);
        String sentence = sentenceScanner.nextLine();
        sentence = sentence.replace(".", " ");
        sentence = sentence.replace("?", " ");
        sentence = sentence.replace("!", " ");
        String words[] = sentence.split(" ");
        int palindromeCount = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuffer stringBuffer = new StringBuffer(word);
            StringBuffer reversedBuffer = stringBuffer.reverse();
            String s1 = word;
            String s2 = reversedBuffer.toString();

            if (s1.equals(s2)) {
                
                palindromeCount = palindromeCount + 1;
            }
        }
        System.out.println("no of palindrome: " + palindromeCount);
        sentenceScanner.close();
    }
}
