public class SearchinArray {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 27, 28, 56, 90, 78, 54 };
        int target = 27;
        int found = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = i;
                break;
            }
        }
        if (found != -1)
            System.out.println("Target existas at index : " + found);
        else
            System.out.println("Target does not exists");
    }

    // boolean flag = false; //element does not exists in array
    // for(int i = 0 ; i < arr.length ; i++){
    // if(arr[i] == target) {
    // flag = true; //target found in array
    // break;
    // }
    // }
    // if(!flag) System.out.println("Tareget missing");
    // else System.out.println("Target missing");

    // int[] arr = {10,20,30,40,50,60};

    // int target = 100;
    // for(int i = 0 ; i < arr.length ; i++){
    // if(arr[i] == target){
    // System.out.println("Element found at index :" + i);
    // return;
    // }
    // }
    // System.out.println("Element not Found!!!");
    // // int index = Arrays.binarySearch(arr, 30);
    // // System.out.println(index);

}
