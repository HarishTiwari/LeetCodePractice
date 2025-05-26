// Last updated: 5/27/2025, 12:47:29 AM
class Solution {
    public int reverse(int x) {
        
        int n = Math.abs(x);
        
        int rev = 0;
        while(n !=0){
            int d = n % 10;
            
            if(rev > (Integer.MAX_VALUE - d) / 10 )
                return 0;
            
            rev = rev * 10 + d;
            n = n / 10;
        }
        
        if(x < 0){
            return -1 * rev;
        }
        
        return rev;
        
        
    }
}