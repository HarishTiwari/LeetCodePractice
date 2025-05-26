// Last updated: 5/27/2025, 12:47:08 AM
class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        return climbStairs(n,dp);
    }

    public int climbStairs(int n , int[] dp){
        if(n==1 || n==2) return n;

        if(dp[n] != -1) return dp[n];

        int a = climbStairs(n-1, dp);
        int b = climbStairs(n-2,dp);
        dp[n] = a+b;

        return a+b;
    }
}