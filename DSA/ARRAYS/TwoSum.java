public class TwoSum {
    public static int[] TwoSum(int[] arr , int target) {
        // int[] arr = {1,5,8,-3};
        // int target = 2;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length;j++){
                if(arr[i] + arr[j] == target) return new int[]{i,j};
            }
       }
       return new int[]{-1,-1};
    }
    public static void main(String[] args) {
         int[] arr = {1,5,8,-3};
         int target = 2;
         int[] result = TwoSum(arr,target);
         System.out.println(result[0] + " " + result[1]);
    }
}
//  int n = arr.length;
//         int target = 2;
//         for(int i = 0 ; i < n ; i++){
//             for(int j = 0  ; j < n ;  j++){
//                  if(arr[i] + arr[j] == target) break;
//             }
//         }