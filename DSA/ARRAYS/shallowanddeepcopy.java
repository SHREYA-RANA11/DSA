import java.util.Arrays;

public class shallowanddeepcopy {
    public static void main(String[] args) {
        int a = 4;
        int[] arr = {10,20,30,40,50}; //16 byte continous memory allocation
        // int[] arr1 = new int[arr.length];
        // for(int i = 0 ; i < arr.length ; i++){
        //     arr1[i] = arr[i];
        // }
        int[] x = arr;  //x is shallow copy of arr
        x[0] = 100;
        int[] deep = Arrays.copyOf(arr, arr.length);
        
        deep[0] = 23;
         for(int i = 0 ; i < deep.length ;i++){
            System.out.print(deep[i] + " ");
         }
         System.out.println();
         for(int i = 0 ; i < arr.length ;i++){
            System.out.print(arr[i] + " ");
         }
    }
}
