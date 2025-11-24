class Solution {
    public int minimumOperations(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i]; 
            if (x % 3 == 0) {
                continue;
            }
            if ((x + 1) % 3 == 0 || (x - 1) % 3 == 0) {
                count++;
            }
        }
        
        return count;
    }
}
