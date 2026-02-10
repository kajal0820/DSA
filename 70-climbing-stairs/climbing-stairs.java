class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[n+1];
       
return climb(n);
        
    }
    public int climb(int n){
        if(n==0) return 1;
         if(n<0) return 0;
         if(dp[n]!=0) return dp[n];
         int ans= climb(n-1) + climb(n-2);
         dp[n]= ans;
         return ans;
    }
}
 // if(n==0) return 1;
        // if(n<0) return 0;
        // int left = climbStairs(n-1);
        // int right = climbStairs(n-2);
        // return left +right;