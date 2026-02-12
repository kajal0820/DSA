class Solution {
    Integer [][] dp;
    public int uniquePaths(int m, int n) {

dp =new Integer[m][n];
return countPaths(0,0,n,m);
        }
        public int countPaths(int i, int j, int m, int n){
            if(i== n-1 && j== m-1 ) return 1;
            if(i == n || j== m) return 0;
            if(dp[i][j]!= null) return dp[i][j];
            int r= countPaths(i,j+1,m,n);
            int d= countPaths(i+1, j,m,n);
            return dp[i][j] = r+d;
        }
}