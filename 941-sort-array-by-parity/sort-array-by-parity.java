class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){

            if(nums[i] % 2 == 0){   
                ans[left++] = nums[i];
            }
            else{                   
                ans[right--] = nums[i];
            }
        }

        return ans;
    }
}