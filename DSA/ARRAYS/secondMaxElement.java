public class secondMaxElement {
    public static void main(String[] args) {
        int[] arr = {4,12,10,18,3,56};
        int max = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;
        //calculate max
        for(int i  = 0 ; i < arr.length ; i++){
                   if(arr[i] > max) max = arr[i];
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > secLar && arr[i]!=max) secLar = arr[i];
        }
        System.out.println(max);
        System.out.println(secLar);
    }
}
