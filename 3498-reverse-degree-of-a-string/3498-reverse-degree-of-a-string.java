class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        for(int i=0; i<s.length(); i++){
            int ascii = (int) s.charAt(i);
            int position = 123 - ascii;
            res += position*(i+1);
        }
        return res;
    }
}