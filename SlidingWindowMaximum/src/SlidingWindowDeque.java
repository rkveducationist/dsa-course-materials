import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowDeque {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            // remove elements out of window
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            // remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // print result when window is ready
            if (i >= k - 1) {
                System.out.println(arr[dq.peekFirst()] + "");
            }
        }
    }
}