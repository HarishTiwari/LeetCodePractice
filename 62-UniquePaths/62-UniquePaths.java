// Last updated: 5/27/2025, 12:47:12 AM
class Solution {
    public int uniquePaths(int m, int n) {
        // defining 2d matrix for DP

        int[][] dp = new int[m][n];

        // filling elements as -1

        for(int i=0 ; i < dp.length ; i++){
            Arrays.fill(dp[i], -1);
        }

        return uniquePath(m-1,n-1,dp);
    }

    public int uniquePath(int m, int n, int[][] dp){
        if(m==0 || n==0){
            return 1;
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        int x = uniquePath(m-1,n,dp);
        int y = uniquePath(m,n-1,dp);

        dp[m][n] = x + y;
        
        return x + y;
    }
}