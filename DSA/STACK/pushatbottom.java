import java.util.Stack;
public class pushatbottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); //bottom 
        st.push(20);
        st.push(30);
        st.push(40); //top
        int ele = 50;
        System.out.println(st);
        pushATBottom(st , ele);  
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    private static void reverse(Stack<Integer> st) {
        if(st.size() <= 1 ) return;
          int top = st.pop();
          reverse(st);
          pushATBottom(st, top);
    }
    private static void pushATBottom(Stack<Integer> st, int ele) {
        if(st.size() == 0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushATBottom(st, ele);
        st.push(top);
    }
}
