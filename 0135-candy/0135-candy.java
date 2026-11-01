class Solution {
    public int candy(int[] arr) {
        int n = arr.length;
        int curr = 1;
        int currNext = 1;
        int peak = 1;
        int down = 0;

        for (int i = 1; i < n; i++) {

            if (arr[i - 1] < arr[i]) {
                currNext++;
                peak = currNext;
                down = 0;
                curr += currNext;
            }
            else if (arr[i - 1] == arr[i]) {
                currNext = 1;
                peak = 1;
                down = 0;
                curr += 1;
            }
            else {
                down++;
                currNext = 1;
                curr += down;

                if (down >= peak) {
                    curr++;
                }
            }
        }

        return curr;
    }
}