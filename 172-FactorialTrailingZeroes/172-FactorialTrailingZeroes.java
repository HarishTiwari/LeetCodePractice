// Last updated: 5/27/2025, 12:46:45 AM
class Solution {
    public int trailingZeroes(int n) {
      
        int count=0;
        while(n!=0)
        {
            n=n/5;
            count+=n;
        }
        return count;
}
}