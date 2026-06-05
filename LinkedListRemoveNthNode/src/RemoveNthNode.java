class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveNthNode {
    public static Node removeNthNodeFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        // move fast pointer n + 1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // move both pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // remove node
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Original List");
        printList(head);

        head = removeNthNodeFromEnd(head, 2);

        System.out.println("After Removal");;
        printList(head);

    }
}