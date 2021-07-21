import java.util.Stack;

/**
 * // stack = LIFO data structure. Last-In First-Out // stores objects into a
 * sort of "vertical tower" // push() to add objects to the top // pop() to
 * remove objects from the top
 *
 * // uses of stacks? // 1. undo/redo features in text editors // 2. moving
 * back/forward through browser history // 3. backtracking algorithms (maze,
 * file directories) // 4. calling functions (call stack)
 */
public class App {
    public static void main(String[] args) throws Exception {
        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());

        stack.push("hi");
        stack.push("hello");
        stack.push("world");
        System.out.println(stack);
        stack.pop();

        System.out.println(stack.search("hello"));
        System.out.println(stack);
        System.out.println(stack.peek());

    }
}
