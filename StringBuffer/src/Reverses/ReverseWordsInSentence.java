package Reverses;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        System.out.println("Enter some phrase: ");
        Scanner sentenceScanner = new Scanner(System.in);
        String sentence = sentenceScanner.nextLine();
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        int lenght = words.length;
        String reverseWords[] = new String[lenght];
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            StringBuffer wordBuffer = new StringBuffer(words[i]);
            reverseWords[i] = wordBuffer.reverse().toString();
        }
        System.out.println(Arrays.toString(reverseWords));
        sentenceScanner.close();
    }

}
