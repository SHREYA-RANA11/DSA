import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array:");
        // int x = sc.nextInt();
        // int [] arr = new int[x];
       
        // System.out.println("Enter the array elemnts :");
        int [] arr = {1,2,3,-4,5};
         int mul = 1 ;
        for(int  i = 0 ; i < arr.length ; i++){
            mul *= arr[i];
           
        }
        System.out.println(mul);
    }
}
