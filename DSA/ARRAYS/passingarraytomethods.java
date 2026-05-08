public class passingarraytomethods {
    public static void main(String[] args) {
        // char x = 10;
        int x[] = {10,20,30,40,50};
        change(x);
        // System.out.println(x[2]);
        for(int i = 0 ; i<x.length ;i++){
            System.out.print(x[i] + " ");
        }
    }
    public static void change(int[]x){
         x[2] = 23;
    }
}
