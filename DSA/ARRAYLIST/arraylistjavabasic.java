import java.util.ArrayList;

import java.util.Collections;

public class arraylistjavabasic {
    public static void main(String[] args) {
        // int[] arr = new int[10];
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(25);  //add from the backside
        arr.add(30);
        arr.add(18);
        arr.add(11);
        arr.add(10);
      
        System.out.println(arr.get(2) + " ");
        arr.set(3, 15); // arr[3] = 15;
        System.out.println(arr.get(3));
        // for(int ele : arr){
        //     System.out.print(ele + " ");
        // }
        System.out.println(arr);
        int n = arr.size();
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr.get(i) + " ");
        }
        //25 30 18 15 10
        arr.add(78);
        arr.add(3,23);
        
        // arr.addAll(arr);
         System.out.print(arr);
        arr.remove(2);
        System.out.println(arr);
        int i = 0 , j = arr.size() - 1 ;
        while (i < j ) {
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j, temp);
            i++;
            j--;

        }
        // Collections.reverse(arr);
        System.out.print(arr);
        ArrayList<Character> arr2 = new ArrayList<>();
        arr2.add('a');
        arr2.add('b');
        arr2.add('c');
        arr2.add('d');
        System.out.print(arr2);
    }
}
