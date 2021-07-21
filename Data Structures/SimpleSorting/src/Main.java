
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter size: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sampleArray = new int[n];
        for (int i = 0; i < sampleArray.length; i++) {
            sampleArray[i] = new Random().nextInt(100);
        }
        System.out.println("Array:");
        System.out.println(Arrays.toString(sampleArray));
        for (int i = 0; i < sampleArray.length; i++) {
            for (int j = i + 1; j < sampleArray.length; j++) {
                if (sampleArray[j] < sampleArray[i]) {
                   int temp = sampleArray[i];
                    sampleArray[i] = sampleArray[j];
                    sampleArray[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(sampleArray));
    }
}

