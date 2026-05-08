import java.lang.reflect.Array;
import java.util.Arrays;

public class sortarraybuiltin {
    public static void main(String[] args) {
        //sort - ascending order
        int[] arr = {10,1,2,3,7,8,0,4};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    private static void print(int[] arr) {
      for(int i = 0 ; i< arr.length;i++){
        System.out.print(arr[i]+ " ");
      }
      System.out.println();
    }
}
