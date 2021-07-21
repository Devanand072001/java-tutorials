import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int length = 7;
        int[] sampleArray = new int[length];
        randomArray(sampleArray);
        //binary search can be applied only on the sorted array.
        Arrays.sort(sampleArray);
        System.out.println(Arrays.toString(sampleArray));
        System.out.println("Enter target to search: ");
        int target = new Scanner(System.in).nextInt();
        int index = bSearch(sampleArray, target);
        targetFound(index);
    }

    private static void targetFound(int index) {
        if (index == -1) {
            System.out.println("target found");
        } else {
            System.out.println("target not found at " + index);
        }
    }

    private static int bSearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            //middle element
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else if (array[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }

    private static void randomArray(int[] sampleArray) {
        for (int i = 0; i < sampleArray.length; i++) {
            sampleArray[i] = new Random().nextInt(10);
        }
    }
}
