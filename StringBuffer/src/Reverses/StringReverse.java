package Reverses;


import java.util.Scanner;

public class StringReverse {


    public static void main(String[] args) {
        System.out.println("enter string to be reversed: ");
        Scanner stringScanner = new Scanner(System.in);
        String sampleString = stringScanner.nextLine();

        StringBuffer stringBuffer = new StringBuffer(sampleString);
        StringBuffer reversedString = stringBuffer.reverse();
        System.out.println("reversed string: " + reversedString);

        String b1 = stringBuffer.toString();
        String b2 = reversedString.toString();
        System.out.println(b1 == b2);
        stringScanner.close();
    }
}
