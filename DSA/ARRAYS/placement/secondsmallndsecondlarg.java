package placement;

public class secondsmallndsecondlarg {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 7, 5 };
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            } else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        System.out.println(second_small);
        System.out.println(second_large);
    }
}
