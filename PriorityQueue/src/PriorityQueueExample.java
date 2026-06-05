import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);


        System.out.println("Top Element: " + pq.peek());
        pq.poll();

        System.out.println("After Removal: " + pq);
    }
}