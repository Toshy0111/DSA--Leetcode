class Solution {
    public boolean checkDivisibility(int n) {      
        int sum = 0;
        int product = 1;
        int ld = 0;
        int temp = n;       
        while(temp != 0){
            ld = temp%10;
            sum += ld;
            product *= ld;
            temp /= 10;
        }
        int s = sum + product;
        if(n % s == 0) return true;
        return false;       
    }
}
