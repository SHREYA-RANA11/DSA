public class maximumelement {
    public static void main(String[] args) {
        int[] arr = {-6,11,4,5,6,23,45,65,-100,34,97};
        // System.out.println(arr[-1]);
        int max = Integer.MIN_VALUE ;
        for(int  i = 0 ; i < arr.length ; i++){
            if(arr[i] > max) max = arr[i];
        }
        System.out.println(max);
    }
}
