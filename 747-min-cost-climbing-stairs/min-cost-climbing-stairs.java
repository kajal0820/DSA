class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        
        // initialize with -1
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }

        return Math.min(climb(0, cost, dp), climb(1, cost, dp));
    }

    public int climb(int i, int[] cost, int[] dp) {
        if (i >= cost.length) return 0;

        if (dp[i] != -1) return dp[i];

        dp[i] = cost[i] + Math.min(
            climb(i + 1, cost, dp),
            climb(i + 2, cost, dp)
        );

        return dp[i];
    }
}