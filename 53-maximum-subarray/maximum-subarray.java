class Solution {
    public int maxSubArray(int[] nums) {
//         int max = Integer.MIN_VALUE;

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i; j < nums.length; j++) {    //brute force
//                 int sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     sum += nums[k];
//                 }
//                 max = Math.max(sum, max);
//             }
//         }

//         return max;
//     }
// }
      int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {    //kadanes algorithm
            sum += nums[i];
            maxi = Math.max(maxi, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;
    }
}