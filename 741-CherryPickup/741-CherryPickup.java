// Last updated: 5/27/2025, 12:46:13 AM
class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int[][][] dp = new int[n][n][n];

        // Proper 3D fill
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                Arrays.fill(dp[i][j], -1);

        int result = Math.max(0, cherryPickup(grid, dp, n - 1, n - 1, n - 1));
        return result;
    }

    public int cherryPickup(int[][] grid, int[][][] dp, int row1, int col1, int row2) {
        int col2 = row1 + col1 - row2; // Because step = row1 + col1 = row2 + col2

        // Boundary and thorn check
        if (row1 < 0 || col1 < 0 || row2 < 0 || col2 < 0 ||
            grid[row1][col1] == -1 || grid[row2][col2] == -1) {
            return Integer.MIN_VALUE;
        }

        if (row1 == 0 && col1 == 0 && row2 == 0 && col2 == 0)
            return grid[0][0];

        if (dp[row1][col1][row2] != -1)
            return dp[row1][col1][row2];

        int cp1 = cherryPickup(grid, dp, row1 - 1, col1, row2 - 1);
        int cp2 = cherryPickup(grid, dp, row1, col1 - 1, row2);
        int cp3 = cherryPickup(grid, dp, row1 - 1, col1, row2);
        int cp4 = cherryPickup(grid, dp, row1, col1 - 1, row2 - 1);

        int maxPrev = Math.max(Math.max(cp1, cp2), Math.max(cp3, cp4));

        if (maxPrev == Integer.MIN_VALUE) {
            dp[row1][col1][row2] = Integer.MIN_VALUE;
            return Integer.MIN_VALUE;
        }

        int cherries = grid[row1][col1];
        if (row1 != row2 || col1 != col2) {
            cherries += grid[row2][col2];
        }

        dp[row1][col1][row2] = cherries + maxPrev;
        return dp[row1][col1][row2];
    }
}
