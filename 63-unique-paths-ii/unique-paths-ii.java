class Solution {
    Integer[][] dp;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // If start is blocked
       if (obstacleGrid[0][0] == 1) return 0;
       dp = new Integer[m][n];

        return countPaths(0, 0, m, n, obstacleGrid);
    }
    public int countPaths(int i, int j, int m, int n, int[][] grid) {

        // Out of boundary
        if (i >= m || j >= n) return 0;

        // If obstacle
        if (grid[i][j] == 1) return 0;

        // Reached destination
        if (i == m - 1 && j == n - 1) return 1;

        // Already calculated
        if (dp[i][j] != null) return dp[i][j];

        int right = countPaths(i, j + 1, m, n, grid);
        int down = countPaths(i + 1, j, m, n, grid);

        return dp[i][j] = right + down;
    }
}
