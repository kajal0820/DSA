class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        
        // Step 1: count total 1s
        int totalOnes = 0;
        for (int num : nums) {
            if (num == 1) totalOnes++;
        }
        
        if (totalOnes == 0) return 0;

        // Step 2: create extended array
        int[] extended = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            extended[i] = nums[i % n];
        }

        // Step 3: sliding window
        int windowOnes = 0;
        int maxOnes = 0;

        for (int i = 0; i < 2 * n; i++) {
            if (extended[i] == 1) windowOnes++;

            // maintain window size
            if (i >= totalOnes) {
                if (extended[i - totalOnes] == 1) {
                    windowOnes--;
                }
            }

            if (i >= totalOnes - 1) {
                maxOnes = Math.max(maxOnes, windowOnes);
            }
        }

        return totalOnes - maxOnes;
    }
}