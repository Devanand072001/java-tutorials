import java.util.Arrays;
import java.util.Random;

public class Main {
    /*
     * https://youtu.be/EwjnF7rFLns
     * Selection sort = search through an array and keep track of
     *                   minimum value during each iteration.
     *                   The variable is swapped at the end of iteration
     *   Quadratic time O(n^2)
     *   smaller the data --> okay
     *   larger the data --> bad
     */
    public static void main(String[] args) {
        //creating array.
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        System.out.println("ascending array:");
        ascendingSelectionSort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Descending array: ");
        descendingSelectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void ascendingSelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    private static void descendingSelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] < array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

    }

}
