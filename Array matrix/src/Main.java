import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] multiArray = new int[3][3];
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray.length; j++) {
                multiArray[i][j] = new Random().nextInt(5);
            }
        }
        System.out.println(Arrays.deepToString(multiArray));
        // print array.
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray.length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

        //(left diagonal)
        System.out.println("Left diagonal simple method");
        for (int i = 0; i < multiArray.length; i++) {
            System.out.print(multiArray[i][i] + " ");
        }
        System.out.println();

        System.out.println("left diagonal");
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray.length; j++) {
                if (i == j) {
                    System.out.print(multiArray[i][j] + "\t");
                }
            }
        }
        System.out.println();
        // right diagonal.
        System.out.println("Right diagonal");
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray.length; j++) {
                if (i + j == multiArray.length-1) {
                    System.out.print(multiArray[i][j] + "\t");
                }
            }
        }
    }
}
