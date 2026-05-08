public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 45, 32, 67, 11, 0, 21, 54, 30 };
        int n = arr.length;
        print(arr);
        // for (int j = 0; j < n - 1; j++) {
        //     for (int i = 0; i < n - 1 - i ; i++) {
        //         if (arr[i] > arr[i + 1]) {
        //             int temp = arr[i];
        //             arr[i] = arr[i + 1];
        //             arr[i + 1] = temp;
        //         }
        //     }
        // }

        // print(arr);
        //bubble sort better approach
         for (int j = 0; j < n - 1; j++) { // n - 1 pass
            boolean isSorted = true;
              int swap = 0;
            for(int i=0;i<n-1;i++){
                if(arr[j]>arr[j+1]) {
                    isSorted = false;
                    break;
                }
                if(isSorted = true) break;
            }
            for (int i = 0; i < n - 1 - i ; i++) {
              
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap++;
                }
                if(swap == 0) break;
            }
           
        }

        print(arr);
    }

    private static void print(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }

}
