import java.util.ArrayDeque;
import java.util.Deque;

/**
 * DoubleEndedQueue
 */
public class DoubleEndedQueue {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.addFirst(3); deque.addLast(4);
        deque.addFirst(5); deque.addLast(6);
        deque.addFirst(7); deque.addLast(8);
        deque.addFirst(9); deque.addLast(10);
        deque.addFirst(11); deque.addLast(12);
        deque.addFirst(13); deque.addLast(14);
        deque.addFirst(15); deque.addLast(16);
        System.out.println(deque);

        deque.removeFirst(); deque.removeLast();
        System.out.println(deque);

        System.out.println(deque.offerFirst(1));System.out.println(deque.offerLast(2));

        System.out.println(deque.pollFirst()); System.out.println(deque.pollLast());

        System.out.println(deque.getFirst()); System.out.println(deque.getLast());

        System.out.println(deque.peekFirst()); System.out.println(deque.peekLast());
    
    }
}
