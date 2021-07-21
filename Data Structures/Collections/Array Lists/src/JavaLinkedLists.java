import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/********************************************************
 LinkedList =  Nodes are in 2 parts (data + address)
                 Nodes are in non-consecutive memory locations
                Elements are linked using pointers
                                singly linked list
                    node                node                    node
                [data | address] -> [data | address] -> [data | address]
                                doubly linked list
                    node                            node
                [address | data | address] -> [address | data | address ]

 linkedList = last in first out (LIFO)
 advantages?
 1. Dynamic Data Structure (allocates needed memory while running)
 2. Insertion and Deletion of Nodes is easy. O(1)
 3. No/Low memory waste

 disadvantages?
 1. Greater memory usage (additional pointer)
 2. No random access of elements (no index [i])
 3. Accessing/searching elements is more time consuming. O(n)

 uses?
 1. implement Stacks/Queues
 2. GPS navigation
 3. music playlist
 ********************************************************/
public class JavaLinkedLists {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.push("1");
        linkedList.push("2");
        linkedList.push("3");
        linkedList.push("4");
        linkedList.push("5");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        System.out.println(linkedList);

        linkedList.pop();

        linkedList.add(4, "6");

        linkedList.remove(1);
        linkedList.remove("3");
        System.out.println(linkedList);

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.offer("1");
        linkedList1.offer("2");
        linkedList1.offer("3");
        linkedList1.offer("4");
        linkedList1.offer("5");

        System.out.println(linkedList1);
        linkedList1.poll();
        System.out.println(linkedList1);
        
        linkedList1.add(4, "6");
        System.out.println("element added successfully");
        System.out.println(linkedList.equals(linkedList1));
        /*Linked list to array list*/
        ArrayList<String> arrayList = new ArrayList<>(linkedList);
        ListIterator<String> iterator = arrayList.listIterator();
        System.out.println("Array list iterator: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Iterator<String> iterator1 = linkedList1.iterator();
        System.out.println("linked list iterator: ");
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}
