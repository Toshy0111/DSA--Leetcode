class Solution {
    public int leastInterval(char[] tasks, int n) {
        int arrLen = tasks.length;
        int res = 0;
        Map <Character, Integer> mp = new HashMap<>();

        //formed a frequency map
        for (int i=0; i<arrLen; i++){
            if( !mp.containsKey(tasks[i]) ){
                mp.put(tasks[i], 1);
            }
            else {
                mp.put(tasks[i], mp.get(tasks[i]) + 1);
            }
        }

        // finding the maxfreq and the no of elements having the maximum frequency
        Integer[] arr = new Integer[mp.size()];
        arr = mp.values().toArray(arr);
        int mfreq = 0;
        int count = 0; //no. of elements with max frequency
        for(int i=0; i<arr.length; i++){
            if(arr[i] > mfreq){
                mfreq = arr[i];
                count = 1;
            } 
            else if(arr[i] == mfreq) {
                count++;
            }
        }
        // res = (length of repeating cycle) * (no. of cycles) + 1
        res = Math.max(tasks.length, (n+1)*(mfreq-1) + count );
        return res;
    }
}