import java.util.*;

class Solution {
    
    public boolean canPartition(int[] nums) {
        
        int sum = 0;
        
        for(int num : nums){
            sum += num;
        }
        
        if(sum % 2 != 0) return false; 
        
        int target = sum / 2;
        
        int[][] dp = new int[nums.length][target + 1];
        
        for(int i = 0; i < nums.length; i++){
            Arrays.fill(dp[i], -1);
        }
        
        return helper(nums, nums.length - 1, target, dp);
    }

    public boolean helper(int[] nums, int i, int target, int[][] dp){
        
        if(target == 0) return true;
        if(i < 0) return false;
        
        if(dp[i][target] != -1){
            return dp[i][target] == 1;
        }
       
        boolean take = false;
        
        if(nums[i] <= target){
            take = helper(nums, i - 1, target - nums[i], dp);
        }

        boolean notTake = helper(nums, i - 1, target, dp);

        boolean ans = take || notTake;

        dp[i][target] = ans ? 1 : 0;

        return ans;
    }
}