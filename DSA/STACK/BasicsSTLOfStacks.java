import java.util.Stack;

public class BasicsSTLOfStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st.size() == 0);
        // st.pop();
        st.push("khushi");
        st.push("shreya");
        st.push("preet");
        st.push("Tisha");
        st.push("parayas");
        System.out.println(st.size());
        System.out.println(st); //a.s = O(n)
        st.pop();
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());  //it does peek work and also printing what it did it returns the topmost ele and then removes it
        String s = st.pop();
        System.out.println(s);
        
    }
}
