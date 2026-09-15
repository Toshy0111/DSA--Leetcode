class Solution {
    public int reverse(int x) {
     int ld;
     int revNo = 0;

// if(x<0){
//     x=x*(-1);
// }
     while(x!=0){
     ld = x%10;
     // check before multiplying by 10
            if (revNo > Integer.MAX_VALUE/10 || (revNo == Integer.MAX_VALUE/10 && ld > 7)) return 0;
            if (revNo < Integer.MIN_VALUE/10 || (revNo == Integer.MIN_VALUE/10 && ld < -8)) return 0;
     revNo = revNo*10 + ld;
     x=x/10;
     }
     return revNo;
    }
}