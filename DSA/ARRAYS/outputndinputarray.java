import java.util.Scanner;

public class outputndinputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //    int[] arr = {1,2,3,4,-3,-7,23,34,-11};
    //    System.out.println(arr[0]);
    //    System.out.println(arr[5]);
    // System.out.println(arr.length);
    
    // for(int i = 0 ; i < arr.length ; i++){
    //     System.out.println(i +" " + "=" + " " + arr[i]);
    // }
    // int i = 0 ;
    // while (i <= 5) {
    //      System.out.println(i +" " + "=" + " " + arr[i]);
    //      i++;
    // }
    int[] shreya = new int[7];
     //default values
    // for(int i  = 0 ; i <= 6 ; i++){
    //     System.out.print(shreya[i]);
    // }
    //taking input
     for(int i  = 0 ; i <= 6 ; i++){
       
        shreya[i] = sc.nextInt();
    }
   //print 
   for(int i = 0 ; i <= 6 ; i++){
    //   System.out.print(shreya[i] * 2+ " ");
    if(shreya[i]<0) System.out.print(shreya[i]);
    else continue;
   }
    }
}
