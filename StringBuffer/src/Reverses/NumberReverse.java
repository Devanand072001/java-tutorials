package Reverses;

import java.util.Scanner;

public class NumberReverse {

    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("enter number to reversed: ");
        int number = numberScanner.nextInt();
        String numberString = Integer.toString(number);
        while (!(numberString.length() > 1)) {
            System.out.println("Length must be greater than 1");
            System.out.println("Enter integer: ");
            numberString = numberScanner.next();

        }
        StringBuffer stringBuffer = new StringBuffer(numberString);
        StringBuffer reverseNumberString = stringBuffer.reverse();
        String rs = reverseNumberString.toString();
        int reversedNumber = Integer.parseInt(rs);
        System.out.println(reversedNumber);

        System.out.println(number == reversedNumber);
        numberScanner.close();
    }
}
