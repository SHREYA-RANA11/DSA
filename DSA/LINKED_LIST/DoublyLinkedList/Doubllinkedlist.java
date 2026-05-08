class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val) {
        this.val = val;
    }
}

class DLL {
    ListNode head;
    ListNode tail;
    int size;

    void insertAtHead(int val) {
        ListNode temp = new ListNode(val);
        if (head == null)
            head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int val) {
        ListNode temp = new ListNode(val);
        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead(int val) {
        ListNode temp = head;
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        if (size == 1)
            head = tail = null;
        else {
            head = head.next;
            head.prev = null;
        }
    }

    void deleteAtTail(int val) {
        ListNode temp = head;
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        if (size == 1)
            head = tail = null;
        else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void insert(int idx, int val) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if(idx == size){
            insertAtTail(val);
            return;
        }   
        ListNode a = new ListNode(val);
        ListNode temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        // ListNode b = temp.next;
        // temp.next = a;
        // a.prev = temp;
        // a.next = b;
        // b.prev = a;
        a.prev = temp;
        a.next = temp.next;
        temp.next = a;
        a.next.prev = a;
        size++;
    }

    void display(int val) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayReverse(int val) {
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

}

public class Doubllinkedlist {

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.insertAtHead(60);
        list.display(0);
        list.displayReverse(0);
        list.insertAtTail(90);
        list.display(0);
        list.deleteAtHead(0);
        list.display(0);
        list.deleteAtTail(0);
        list.display(0);
    }
}