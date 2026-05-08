package BINARY_TREE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

class Pair {
    int val;
    Node node;
    int level;

    Pair(Node node, int level) {
        this.node = node;
        this.level = level;
    }
}

public class order {
    public static void main(String[] args) {
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
        // levelOrder(a);
        // levelOrderLinewise(a);
        // preorder(a);
        // inorder(a);
        // postorder(a);
        // for(int i = 0 ; i<level(a) ; i++){
        // kThlevel(a, 0, i);
        // System.out.println();
        // }
        kThlevel(a, 0, 1);
    }

    private static void kThlevel(Node root, int level, int k) {
        if (root == null)
            return;
        if (level == k)
            System.out.print(root.val + " ");
        kThlevel(root.left, level + 1, k);
        kThlevel(root.right, level + 1, k);
    }

    private static void levelOrderLinewise(Node a) {
        Queue<Pair> q = new LinkedList<>();
        int currentLev = 0;
        q.add(new Pair(a, 0));
        while (q.size() > 0) {
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;
            if (front.level != currentLev) {
                currentLev++;
                System.out.println();
            }
            System.out.print(front.node.val + " ");
            if (node.left != null)
                q.add(new Pair(front.node.left, level + 1));
            if (node.right != null)
                q.add(new Pair(front.node.right, level + 1));
        }
        System.out.println();
    }

    private static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.size() > 0) {
            Node front = q.remove();
            System.out.print(front.val + " ");
            if (front.left != null)
                q.add(front.left);
            if (front.right != null)
                q.add(front.right);

        }

        System.out.println();

    }

    private static void postorder(Node root) {
        if (root == null)
            return;

        preorder(root.left);
        preorder(root.right);
        System.out.print(root.val + " ");
    }

    private static void inorder(Node root) {
        preorder(root.left);
        System.out.print(root.val + " ");
        preorder(root.right);

    }

    private static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static ArrayList<ArrayList<Integer>> Paths(Node root) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root, arr, ans);
        return ans;
    }

    private static void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            arr.add(root.val);
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(arr);
            ans.add(list);
        }
        arr.add(root.val);
        dfs(root.left, arr, ans);
        dfs(root.right, arr, ans);
        arr.remove(arr.size() - 1); // bacltracking
    }

    public ArrayList<Integer> rightView(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();
        view(root, 0, ans);
        return ans;
    }

    private void view(Node root, int level, ArrayList<Integer> ans) {
        if (root == null)
            return;
        if (level >= ans.size())
            ans.add(root.val);
        else
            ans.set(level, root.val);
        view(root.left, 0, ans);
        view(root.right, 0, ans);

    }

    // Node lca(Node root, int p, int q) {
    // if(root == null) return null;
    // if(root.data == p || root.data == q){
    // return root;
    // }
    // boolean pliesleft = exists(root.left , p);
    // boolean qliesright = exists(root.right , q);
    // if(pliesleft && !qliesright) return lca(root.left, p, q);
    // else if(pliesleft && qliesright) return lca(root.right, p, q);
    // else return root;
    // }

    // private boolean exists(Node root, int val) {
    // if(root == null) return false;
    // if(root.data == val) return true;
    // return exists(root.left, val) || exists(root.right, val);
    // }

    int findDist(Node root, int a, int b) {
        Node LCA = lca(root, a, b);
        int[] dis = { 0, 0 };
        dfs(LCA, a, b, 0, dis);

        return dis[0] + dis[1];

    }

    private void dfs(Node root, int a, int b, int level, int[] dis) {
        if (root == null)
            return;
        if (root.data == a)
            dis[0] = level;
        if (root.data == b)
            dis[1] = level;
        dfs(root.left, a, b, level + 1, dis);
        dfs(root.right, a, b, level + 1, dis);

    }

    Node lca(Node root, int p, int q) {
        if (root == null)
            return null;
        if (root.data == p || root.data == q)
            return root;
        Node l = lca(root.left, p, q);
        Node r = lca(root.right, p, q);
        if (l != null && r != null)
            return root;

        return (l == null) ? r : l;

    }

    public static void flatten(Node root) {
        if (root == null)
            return;
        Node lst = root.left;
        Node rst = root.right;
        root.left = null;
        root.right = null;
        flatten(lst);
        flatten(rst);
        root.right = lst;
        Node last = root; // left subtree ka last element
        while (last.right != null) {
            last = last.right;
        }
        last.right = rst;
    }

    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root, arr, ans, sum);
        return ans;

    }

    private static void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans, int sum) {
      
        if (sum == 0) {
            ArrayList<Integer> arr2 = new ArrayList<>();
            arr2.addAll(arr);
            ans.add(arr2);
            return;
        }
        if(root == null ) return;
        arr.add(root.data);

        dfs(root.left, arr, ans, sum - root.data);
        dfs(root.right, arr, ans, sum - root.data);
        arr.remove(arr.size() - 1);
    }

}
