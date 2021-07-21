

public class Main {
    /*Dynamic Array:
     *      It is declared with fixed size and extends memory
     * using heap in the run time, when the array is full
     * Advantage:
     *   Random access of elements o(1)
     *   Good locality of reference and data cache utilization
         (memory address are continuous but in linked list memory address are random)
     *   Easy to insert/delete at the end (no shifting required)
     *
     * Disadvantages:
     *      Array size must specified while declaration
     *      wastage of memory than linked list
     *      shifting element is time consuming o(n)
     *      Expanding or shrinking is time consuming o(n)
     *
     * In static array:
     *      size = 5 --> capacity =  5;
     * In dynamic array:
     *      size = 5 --> capacity = 10;
     */
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);
        System.out.println(dynamicArray.isEmpty());
        dynamicArray.add("a");
        dynamicArray.add("b");
        dynamicArray.add("c");

        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity " + dynamicArray.capacity);

        System.out.println(dynamicArray.get(0));
        dynamicArray.insert(0,"x");
        dynamicArray.delete("c");
        dynamicArray.search("b");
        System.out.println(dynamicArray);


    }
}
