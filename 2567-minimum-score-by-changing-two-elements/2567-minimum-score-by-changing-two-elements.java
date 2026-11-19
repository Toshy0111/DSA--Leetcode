class Solution {
    public int minimizeSum(int[] arr) {
      Arrays.sort(arr);
     
      int n = arr.length;

      int a = arr[n-2] - arr[1];
      int b = arr[n-3] - arr[0];
      int c = arr[n-1] - arr[2];

      return Math.min(a, Math.min(b, c));
    }
}