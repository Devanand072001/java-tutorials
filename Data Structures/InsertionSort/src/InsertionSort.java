import java.util.Arrays;

public class InsertionSort {
    /*
    * 1) Begin at index 1.
    * 2) Move to temp.
    * 3) check temp < index -1
    * 4) if temp > index - 1
    *      index = index +1 (move one index right).
    https://youtu.be/8mJ-OhcfpYg
    *
    *
    */
    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};
        System.out.println("Before insertion sort: ");
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println("After insertion sort: ");
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        //iterate array from index 1;
        for (int index = 1; index < array.length; index++) {
            //store index to temp;
            int temp = array[index];
            //moving index to the left of index;
            int left = index - 1;
            // move the element to the right until the element is < temp;
            while (left >= 0 && array[left] > temp) {
                array[left + 1] = array[left];
                left--;
            }
            //assign the element in the temp to array;
            array[left + 1] = temp;
        }
    }
}
