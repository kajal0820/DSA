class Solution {
    Integer[][] dp;

    public int uniquePaths(int m, int n) {
        dp = new Integer[m][n];
        return countPaths(0, 0, m, n);
    }

    public int countPaths(int i, int j, int m, int n) {

        // Reached bottom-right
        if (i == m - 1 && j == n - 1) return 1;

        // Out of boundary
        if (i >= m || j >= n) return 0;

        // Already calculated
        if (dp[i][j] != null) return dp[i][j];

        int right = countPaths(i, j + 1, m, n);
        int down = countPaths(i + 1, j, m, n);

        return dp[i][j] = right + down;
    }
}
