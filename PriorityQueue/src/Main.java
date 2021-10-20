import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] arg) {
        /*PriorityQueue = It is a FIFO DS, which serves higher priority element
                            before the lower priority element.
                          It shorts the inserted elements irrespective to the order.*/
//        PriorityQueue<Double> marks = new PriorityQueue<>();
        PriorityQueue<Double> marks = new PriorityQueue<>(Collections.reverseOrder());// reverse order
        marks.add(7.3);
        boolean isInserted = marks.offer(2.4);
        marks.add(5.0);
        marks.add(2.33);
        System.out.println(marks);
        System.out.println(isInserted);
        System.out.println("\npeeek() " + marks.peek());

//        iteration
        while (!marks.isEmpty()) {
            System.out.println(marks.poll());
        }
    }
}
