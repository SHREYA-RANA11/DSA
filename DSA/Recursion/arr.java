
public class arr {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 8, 9, 0 };
        // recPrint(arr, 0);
        int ele = 7;
        System.out.println(exists(arr, 0, 0));
    }

    public static boolean exists(int[] arr, int ele, int idx) {
        if (idx == arr.length)
            return false;
        if (arr[idx] == ele)
            return true;
        return exists(arr, ele, idx+1);
    }

    // public static void recPrint(int arr[] , int idx ) {
    // int n = arr.length;
    // if(idx==n) return;

    // recPrint(arr, idx+1);
    // System.out.println(arr[idx] + " ");
    // }
}
