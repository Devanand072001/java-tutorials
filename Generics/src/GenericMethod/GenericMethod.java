package GenericMethod;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericMethod {
    /*
     * Generics:
     *   Used to create classes, Interfaces, method that
     * automatically accepts all data type as arguments.
     *
     *   Only one version of method or is created and can be
     * used for all referenced data types.
     * eg:
     * ArrayList<Integer> list = new ArrayList<>();
     * HashMap<Integer, String> hashMap = new HashMap<>();
     * */

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.2, 2.2, 3.5, 7.9};
        String[] stringArray = {"H", "e", "l", "l", "o"};
        Character[] charArray = {'W', 'o', 'r', 'l', 'd'};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(stringArray);
        displayArray(charArray);
    }

   /* private static void displayArray(Integer[] intArray) {
        for(int i: intArray){
            System.out.print(i + ", ");
        }
    }
    private static void displayArray(Double[] doubleArray) {
        for(double i: doubleArray){
            System.out.print(i + ", ");
        }
    }*/

    //generic method
    public static <Things> void displayArray(Things[] array) {
        for (Things i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
