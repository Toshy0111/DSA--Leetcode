import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] square = new long[n];

        for (int i = 0; i < n; i++) {
            square[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(square);

        long res = 0;

        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                res -= square[i];
            } else {
                res += square[i];
            }
        }

        return res;
    }
}