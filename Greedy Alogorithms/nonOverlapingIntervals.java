class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr, (a,b) -> (a[1] - b[1]));
        int n = arr.length;
       int res = 0;
      int i = 1;
      int k = arr[i-1][1];
      while(i<n)
      {
        if(arr[i][0] < k){
            res++;
        }
        else {
            k = arr[i][1];
        }
        i++;
      } 
        return res;
    }
}
