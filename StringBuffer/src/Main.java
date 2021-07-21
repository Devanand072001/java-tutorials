public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * 1.string is immutable (when edited new object is created). 2.string buffer is mutable
         * (changes occurs in same object). used in single threading. syncronised .threa safe
         * 3.string builder is
         * same as string buffer but used in multiple threading. not syncronised.not thread safe
         */

        var stringBuffer = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
        System.out.println("revers: " + stringBuffer.reverse());
        System.out.println("capacity (16*length): " + stringBuffer.capacity());
        System.out.println(stringBuffer.hashCode());
        System.out.println(stringBuffer.append("_ ABCDEF"));
        System.out.println(stringBuffer);

    }
}
