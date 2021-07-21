import java.util.*;

public class Main {
    /* https://youtu.be/3j0SWDX4AtU
     * time complexity = O(n log n
     * Space complexity = O(n)
     * Recursive algorithm (divide and conquer),
     * It divides the array by 2, sort, recombine*/
    public static void main(String[] args) {
        int[] array = randomArray(10);
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(array));

        mergeSort(array);
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) {
            return;// base condition
        }
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        // split the arrays into leftArray, rightArray
        for (int i = 0, j = 0; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, r = 0, l = 0; //indices

        // checking conditions
        // sorting arrays and copy to main array.
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        // copy the remaining elements from leftArray to array.
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        // copy the remaining elements from rightArray to array.
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    //generate random array
    private static int[] randomArray(int length) {
        int[] randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = new Random().nextInt(length);
        }
        return randomArray;
    }
}
