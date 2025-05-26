// Last updated: 5/27/2025, 12:47:09 AM
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for(int i=0 ; i < m ; i++){
            Arrays.fill(dp[i],-1);
        }

        return minPathSum(grid , m-1 , n-1 , dp);
    }

    public int minPathSum(int[][] grid , int m , int n , int[][] dp){
        if(m < 0 || n < 0){
            return Integer.MAX_VALUE;
        }

        if(dp[m][n] != -1) return dp[m][n];

        if(m==0 && n==0) return grid[m][n];

        int x = minPathSum(grid,m-1,n,dp);
        int y = minPathSum(grid,m,n-1,dp);

        dp[m][n] = grid[m][n] + Math.min(x,y);

        return dp[m][n];
    }
}