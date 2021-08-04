import java.lang.reflect.Array;
import java.util.*;

public class Main {
    /*
     * https://youtu.be/Vtckgz38QHs
     * Quick sort => Moves smaller element to left of the pivot.
     *               recursively divides array into 2 partitions
     * It is a recursive divide and conquer algorithm.
     * It is an in place algorithm, we have to keep track of
     * beginning and ending indices of partitions.
     * run-time-complexity:
     *   best case O(n log(n))
     *   average case O(n log(n))
     *   worst case O(n^2) [if already sorted]
     * Space complexity:
     *   O(log(n)) */
    public static void main(String[] args) {
        int[] array = randomArray(8);
        System.out.println("Array before quick sort: ");
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("Array after quick sort: ");
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end <= start)
            return; //base case
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1); // left partition
        quickSort(array, pivot + 1, end); // right partition
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end]; // fixing pivot as end
        int i = start - 1; // fixing i as index before start
        for (int j = start; j < end; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        // fixing pivot at correct postion
        return i;
    }


    private static int[] randomArray(int size) {
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = new Random().nextInt(10);
        }
        return randomArray;
    }
}
