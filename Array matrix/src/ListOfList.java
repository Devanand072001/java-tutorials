import java.util.*;

public class ListOfList {
    public static void main(String[] args) {
        ArrayList<List<Integer>> listOfLists = new ArrayList<List<Integer>>();

        // Create N lists one by one
        // and append to the list of lists
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(5);
        list1.add(10);
        list1.add(11);
        listOfLists.add(list1);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        listOfLists.add(list2);

        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(20);
        list3.add(30);
        list3.add(40);
        listOfLists.add(list3);

        // by two for loops
        for (int i = 0; i < listOfLists.size(); i++) {
            for (int j = 0; j < listOfLists.size(); j++) {
                System.out.print(listOfLists.get(i).get(j) + "\t");
            }
            System.out.println();
        }
    }
}
