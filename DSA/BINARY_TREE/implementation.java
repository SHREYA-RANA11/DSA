package BINARY_TREE;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class implementation {
    public static void main(String[] args) {
        // -1 1 6 9
        // 4 2
        // 3
        Node a = new Node(3);// root
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
         c.right = g;
        display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(mul(a));
        System.out.println(max(a));
        System.out.println(levels(a));
    }

    private static int levels(Node root) {
        if (root == null)
            return 0;

        return 1 + Math.max(levels(root.left), levels(root.right));

    }

    private static int size(Node root) {
        // if (root == null)
        // return 0;
        // int leftSize = size(root.left);
        // int rightSize = size(root.right);
        if(root.left == null && root.right == null) return 1; //optimizing the code nut doesn't nedd to much need if we have big tree doesn't need this
        return (root == null) ? 0 : (1 + size(root.left) + size(root.right));
    }

    private static int sum(Node root) {
        // if (root == null)
        // return 0;
        // int leftSize = size(root.left);
        // int rightSize = size(root.right);
        return (root == null) ? 0 : (root.val + sum(root.left) + sum(root.right));
    }

    private static int mul(Node root) {
        if (root == null)
            return 1;
        // int leftSize = mul(root.left);
        // int rightSize = mul(root.right);
        return (root.val * mul(root.left) * mul(root.right));
    }

    private static int max(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    private static void display(Node root) {
        if (root == null)
            return;

        display(root.right);// itself it print the values of right
        System.out.print(root.val + " ");
        display(root.left); // itself it print the values of left
    }
}
