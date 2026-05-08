import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class linkprep {

    // public static void display(Node head) {

    // // Node temp = head;
    // // while (temp != null) {
    // // System.out.print(temp.val + " ");
    // // temp = temp.next;
    // // }
    // }
    public static boolean Searchrec(Node head, int tar) {
        if (head == null)
            return false;
        if (head.val == tar)
            return true;

        return Searchrec(head.next, tar);
    }

    public static void main(String[] args) {

        // taking input
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        Node head = new Node(10);
        Node head1 = new Node(20);
        Node head2 = new Node(30);

        head.next = head1;
        head1.next = head2;

        // // Node head = new Node(10);
        // // head.next = new Node(20);
        // // head.next.next = new Node(30);
        // for (int i = 1; i < n; i++) {
        // temp.next = new Node(sc.nextInt());
        // temp = temp.next;
        // }
        System.out.println(Searchrec(head, 10));
        System.out.println(Searchrec(head, 20));
        System.out.println(Searchrec(head, 30));
    }
}
