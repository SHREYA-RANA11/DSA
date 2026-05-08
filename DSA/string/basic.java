

import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        String s = "shreya";
        change(s);
        System.out.println(s);
        String[] arr = { "santosh", "krish", "Gopi", "preet" };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        ArrayList<String> al = new ArrayList<>();
        al.add("mahek");
        al.add("ayaan");
        al.add("raghav");
        al.add("modijii");
        System.out.println(al);
        change2(al);
        System.out.println(al);
    }

    private static void change2(ArrayList<String> al) {
        al.add("hello");
    }

    private static void change(String s) {
        s = "shrey";
    }
}
