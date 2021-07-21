import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*https://youtu.be/xrMppTpoqdw*/
    /*
     * Binary search is an algorithm used to find the position of the element from an sorted array.
     * Half of the array is discarded in each step.
     * space time complexity O(log n)*/

    public static void main(String[] args) {
//        int[] sampleArray = new int[100];
        int[] sampleArray = {3, 5, 1, 11, 9, 7};
        Arrays.sort(sampleArray);
        System.out.println(Arrays.toString(sampleArray));
        System.out.println("Enter target: ");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        //to assign 0 to 100 in the array
        /*for (int i = 0; i < sampleArray.length; i++) {
            if (!(i % 2 == 0)) {
                sampleArray[i] = i;
            }
        }*/
//        int index = Arrays.binarySearch(sampleArray, target);
        int index = Arrays.binarySearch(sampleArray, target);



        System.out.println(index);
        if (index <= -1) {
            System.out.println("target not found");
        } else {
            System.out.println("target found at index: " + index);
        }
    }

}
