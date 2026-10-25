class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int start = 0;
        int currGain = 0;
        int totalGain = 0;
        for(int i=0; i<n; i++){
            currGain += gas[i] - cost[i];
            totalGain += gas[i] - cost[i];
            if(currGain < 0){
                start = i + 1;
                currGain = 0;
            }
        }

        if(totalGain >= 0){
            return start;
        }
        return -1;
    }
}