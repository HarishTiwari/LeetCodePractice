// Last updated: 5/27/2025, 12:46:28 AM
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

       return numSquares(n , dp);
    }

    public int numSquares(int n , int[] dp){
        
        if(n==0) return 0;
        if(dp[n] != -1) return dp[n];

        int minCount = Integer.MAX_VALUE;

        for(int i = 1 ; i*i <=n ; i++ ){
            int square = i*i;
            minCount = Math.min(minCount, numSquares(n-square,dp));
        }

        dp[n] = minCount + 1;

        return minCount + 1;
    }
}