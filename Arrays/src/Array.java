public class Array {
    private int[] items;
    private int count; // keep track of no of items add to array.

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // if arrays is full, create and copy items to new array.
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        // add item at last index.
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
           throw new IllegalArgumentException("Invalid argument: \n try value < 0 and < "+count);
        }
        // move to the index, shift elements one index forward.
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count --;// decrement array size by 1;
    }
    public void search(int item){
        boolean isFound = false;
        int pos = 0;
        for (int i = 0; i < count; i++) {
           isFound = items[i] == item;
           pos = i;
        }
        if (isFound){
            System.out.println("Found at "+ pos);
        }else {
            System.out.println("Item not found");
        }
    }
    void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
        // System.out.println(Arrays.toString(items));
    }

    public int getCount() {
        return count;
    }
}
