//import java.util.Arrays;
//
////https://youtu.be/0agWhWeYB8Q
////https://youtu.be/LHSdAh8aFmI
//public class Main {
//    public static void main(String[] args) {
//        int[] array = {7, 6, 10, 5, 9, 2, 1, 15, 7};
//        int lowerBound = 0;
//        int upperBound = array.length - 1;
//        quickSort(array, lowerBound, upperBound);
//        System.out.println(Arrays.toString(array));
//
//    }
//
//    private static void quickSort(int[] array, int lowerBound, int upperBound) {
//
//
//        if (lowerBound < upperBound) {
//            int location = partition(array, lowerBound, upperBound);
//            quickSort(array, lowerBound, location - 1);
//            quickSort(array, location + 1, upperBound);
//        }
//    }
//
//    private static int partition(int[] array, int lowerBound, int upperBound) {
//        int pivot = array[lowerBound];
////
//        int start = lowerBound;
//        int end = upperBound;
//
//        while (start < end) {
//            while (array[start] <= pivot) {
//                start++;
//
//            }
//            while (array[end] > pivot) {
//                end--;
//            }
//            if (start <= end) {
//                swap(array, start, end);
//            }
//        }
//        swap(array, lowerBound, upperBound);
//        return end;
//    }
//
//    private static void swap(int[] array, int lowerBound, int end) {
//        int temp = array[lowerBound];
//        array[lowerBound] = array[end];
//        array[end] = temp;
//    }
//}

//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
}
