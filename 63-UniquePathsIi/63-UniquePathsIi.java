// Last updated: 5/27/2025, 12:47:11 AM
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int [][] dp = new int[m][n];

        for(int i=0 ; i < dp.length ; i++){
            Arrays.fill(dp[i],-1);
        }

        return uniquePathsWithObstacles(obstacleGrid , m-1 , n-1 , dp);
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid , int m , int n , int[][] dp){
        if( m < 0 || n < 0) return 0;

        if(obstacleGrid[m][n] == 1) {
            return 0;
        }

        if(m==0 && n==0){
            return 1;
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        int x = uniquePathsWithObstacles(obstacleGrid,m-1,n,dp);
        int y = uniquePathsWithObstacles(obstacleGrid,m,n-1,dp);

        dp[m][n] = x + y;

        return x + y;
    }
}