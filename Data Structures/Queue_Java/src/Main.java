import java.util.LinkedList;
import java.util.Queue;

public class Main {
    /*Queue - First In Firs Out (FIFO)
     *       A collection for holding elements in prior
     *       add = enqueue, offer()
     *       remove = dequeue, poll()
     *       In java Queue is a interface
     * Queue applications:
     * 1) Keyboard Buffer (letter typed appears in the pressed order)
     * 2) printer
     * 3) LinkedLists, PriorityQueues, Breath-first search(BFS)*/
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        //adding queue elements (enqueue)
        queue.offer("Mathew");
        queue.offer("Franklin");
        queue.offer("Karen");
        System.out.println(queue.isEmpty());
        System.out.println(queue);
        //first element of the queue.
        System.out.println(queue.peek());
        //dequeue
        queue.poll();
        queue.poll();
        //display current element
        System.out.println(queue.element());
        //queue size
        System.out.println(queue.size());
        //check the availability of elements
        System.out.println(queue.contains("Karen"));
    }
}
