class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListReverse {
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Original List");
        printList(head);

        head = reverse(head);
        System.out.println("Reversed List");
        printList(head);
    }
}