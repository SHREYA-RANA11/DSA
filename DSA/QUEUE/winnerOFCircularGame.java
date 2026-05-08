import java.util.LinkedList;
import java.util.Queue;

public class winnerOFCircularGame {
    public int findTheWinner(int n, int k) {

 Queue<Integer> q = new LinkedList<>();
 for(int i = 1 ; i <= n ; i++){
     q.add(null);
 }
while (q.size() > 0 ) {
    // k -1 remove and add
    for(int i = 1 ; i<= k - 1 ; i++){
        q.add(q.remove());
    }
    q.remove();
}

        return  q.peek();
    }
}
