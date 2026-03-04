class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n = nums.length;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%n]){  // it also check the last element with the first element . 
            count++;
            }

        }
        return count<=1;
        
    }
}