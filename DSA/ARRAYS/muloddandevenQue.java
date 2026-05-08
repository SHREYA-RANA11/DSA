import java.util.Arrays;

public class muloddandevenQue {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
         evenoddcal(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void evenoddcal(int[] x) {
       for(int i = 0 ; i<x.length;i++){
         if(i%2 != 0) {
                  x[i]= 2 *  x[i];
         }else 
         {
            x[i]= x[i] + 10;
         }
       }
    }
}

