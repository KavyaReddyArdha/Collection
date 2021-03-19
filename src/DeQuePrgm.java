import java.util.ArrayDeque;
import java.util.Deque;

public class DeQuePrgm {
    public static void main(String args[]) {
        Deque<String> d = new ArrayDeque<String>();
        d.add("Manchuria");
        d.add("Momos");
        d.addLast("Maggie");
        d.addFirst("EGG65");
        d.add("Chilli Chicken");
        System.out.println("Dishes in deque:" + d);
        System.out.println("Removed element: " + d.removeLast());
        System.out.println("Head: " + d.element());
        System.out.println("poll(): " + d.pollLast());
        System.out.println("peek(): " + d.peek());
        System.out.println("Dishes in Deque:" + d);
    }
}
