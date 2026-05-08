public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 45, 32, 67, 11, 0, 21, 54, 30 };
        print(arr);
        int n = arr.length;
        for(int i = 0 ; i < n - 1 ;i++){
            int min = Integer.MAX_VALUE;
            int minidx = -1;
            for(int j = i ; j < n ; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minidx = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx]=temp;
        }
        print(arr);
    }
    private static void print(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }
}
