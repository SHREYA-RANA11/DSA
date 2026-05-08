public class largestStringPossible {
    String largestSwap(String s) {
        String max = s;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                String newstr = new String(arr);
                if (newstr.compareTo(max) > 0) {
                    max = newstr;
                }
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return max;

    }

    public static void main(String[] args) {
          largestStringPossible obj = new largestStringPossible();
          String result = obj.largestSwap("768");
          System.out.println(result);
    }
}