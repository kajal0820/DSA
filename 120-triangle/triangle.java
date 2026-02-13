class Solution {

    Integer[][] dp;   

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        dp = new Integer[n][n];
        return solve(0, 0, triangle);
    }

    public int solve(int i, int j, List<List<Integer>> tri) {

        if (i == tri.size() - 1)
            return tri.get(i).get(j);

        if (dp[i][j] != null)
            return dp[i][j];

        int same = solve(i + 1, j, tri);
        int next = solve(i + 1, j + 1, tri);

        return dp[i][j] = tri.get(i).get(j) + Math.min(same, next);
    }
}
