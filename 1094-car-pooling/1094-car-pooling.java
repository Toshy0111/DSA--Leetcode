class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
    
        int[] loc = new int[1001];
        
        for(int i=0; i<trips.length; i++){
            int passengers = trips[i][0];
            int from = trips[i][1];
            int to = trips[i][2];
            loc[from] += passengers;
            loc[to] -= passengers;
        }

int usedCapacity = 0;

        for(int i=0; i<loc.length; i++){
            usedCapacity += loc[i];
            if(usedCapacity > capacity)  return false;
        }

    return true;

    }
}