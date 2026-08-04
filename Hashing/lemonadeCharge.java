class Solution {
    public boolean lemonadeChange(int[] bills) {
         Map<Integer, Integer> mp = new HashMap<>();
        mp.put(5, 0);
        mp.put(10, 0);

        for (int ch : bills) {

            if (ch == 5) {
                mp.put(5, mp.get(5) + 1);
            }

            else if (ch == 10) {
                if (mp.get(5) == 0) {
                    return false;
                }

                mp.put(5, mp.get(5) - 1);
                mp.put(10, mp.get(10) + 1);
            }

            else { // ch == 20

                if (mp.get(10) > 0 && mp.get(5) > 0) {
                    mp.put(10, mp.get(10) - 1);
                    mp.put(5, mp.get(5) - 1);
                }
                else if (mp.get(5) >= 3) {
                    mp.put(5, mp.get(5) - 3);
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }
}