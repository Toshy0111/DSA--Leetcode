import java.util.ArrayDeque;
import java.util.Deque;

public class slidingWindowMaximum {
    public int[] maxSlidingWindow(int[] arr, int k) {

        int n = arr.length;
        int[] res = new int[n - k + 1];

        Deque<Integer> q = new ArrayDeque<>();

        int i = 0, j = 0;

        while (j < n) {

            while (!q.isEmpty() && arr[j] > q.peekLast()) {
                q.pollLast();
            }

            q.offerLast(arr[j]);

            if (j >= k - 1) {
                res[i] = q.peekFirst();

                if (q.peekFirst() == arr[i]) {
                    q.pollFirst();
                }
                i++;
            }
            j++;
        }
        return res;
    }

}
