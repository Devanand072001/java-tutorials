public class Main {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(3);
        array.insert(5);
        array.insert(10);
        array.insert(11);
        array.insert(12);
        array.removeAt(3);
        array.print();
        array.search(12);
        // System.out.println(array.getCount());
    }
}
