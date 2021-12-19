import java.util.Arrays;

public class VarArgMethods {
    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3, 5, 6));
        System.out.println( sum(4, 5, 5, 5));
        //var-arg of array
        System.out.println(sum(new int[][]{{10, 20, 30},{40, 50}}));
        sum("Devanand",120, 34434, 434);
    }
    private  static int sum(int ... a){
        int sum = 0;
        for(int i : a) {
            sum += i;
        }
        return  sum;
    }
    private  static int sum(int[] ... a){
        int sum = 0;
        for(int[] x : a) {
            for (int i : x)
                sum += i;
        }
        return  sum;
    }
    private  static void sum(String s, int... a){
        System.out.println(s);
        System.out.println(Arrays.toString(a));
    }

}
