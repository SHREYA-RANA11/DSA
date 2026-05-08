package placement;

public class minelement {
    public static void main(String[] args) {
        int[] arr = {2,1,43,-1,4,5,21};
        int min = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < min) min=arr[i];
        }
        System.out.println(min);
    }
}
