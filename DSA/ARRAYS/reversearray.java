public class reversearray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 9, 0, 1, 45, 78 };
    //    int n = arr.length;
    //     for(int i = 0 ; i < n/2 ; i++){
    //         //swap arr[i] and arr[n-1-i] 
    //         int temp = arr[i];
    //         arr[i] = arr[n-i-1];
    //         arr[n-i-1] = temp;
    //     }
    //     for (int ele : arr) {
    //          System.out.print(ele + " ");
    //      }
     int i = 2;
        int j = 5;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
//  int i = 0;
//         int j = arr.length - 1;
//         while (i < j) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;

//         }
        // for (int ele : arr) {
        //     System.out.print(ele + " ");
        // }