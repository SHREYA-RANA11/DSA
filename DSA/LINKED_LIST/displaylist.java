import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class displaylist {
    public static  void displayRec(Node head){
          if(head == null) return;
       
        displayRec(head.next);
         System.out.println(head.val +" ");
    }
    public static void display(Node head) {
        // System.out.println(head.val+" ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next; // imp
        }

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // Node a = new Node(sc.nextInt());
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(5);

        // connect nodes together(link)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        //display(a);
        // displayRec(a);
        System.out.println(get(a, 2));
        // Node n = null ;
        // System.out.println(n.val);
        // System.out.println(n.next);

    }
    private static int get(Node head ,int idx) {
       Node temp = head;
        for( int i = 1 ; i <= idx ; i++){
            temp = temp.next;
        }
        return temp.val;
       
    }
}
