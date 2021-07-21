import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int[] array = {13, 2, 4, 15, 12, 10, 5};

        ArrayList<Integer> oddArray = new ArrayList<>();
        ArrayList<Integer> evenArray = new ArrayList<>();
        for (int j : array) {
            if (j % 2 == 0) {
                evenArray.add(j);
            } else {
                oddArray.add(j);
            }
        }
        Collections.sort(evenArray);
        oddArray.sort(Collections.reverseOrder());
        System.out.println(evenArray);

        System.out.println(oddArray);
        evenArray.addAll(oddArray);
        System.out.println(evenArray);

    }
}
