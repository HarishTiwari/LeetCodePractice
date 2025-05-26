// Last updated: 5/27/2025, 12:46:05 AM
class Solution {

    public int fib(int n) {

        // using DP

        int[] dp = new int[n+1];
        Arrays.fill(dp, -1); // to set all values -1.

        return fib(n,dp); 
    }

    public int fib(int n,int[] dp) {

        if(n==0 || n==1) return n;

        if(dp[n] != -1) return dp[n];

        int a = fib(n-1,dp);
        int b = fib(n-2,dp);

        dp[n] = a+b;

        return a+b; 
    }
}