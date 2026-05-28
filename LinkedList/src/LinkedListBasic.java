class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListBasic {
    public static void main(String[] args) {
        // create nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // link nodes
        head.next = second;
        second.next = third;

        // traverse and show/print
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }
}