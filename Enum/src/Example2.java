enum Number{
    ONE(1), TWO(2), THREE(3), ;

    //CONSTRUCTOR
    int value;
    Number(int value) {
        this.value = value;
    }
}
public class Example2 {
    public static void main(String[] args) {
        for (Number num : Number.values()) {
            System.out.println(num+" values: "+ num.value);
        }
        Number number = Number.ONE;
    }
}
