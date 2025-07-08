// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n = nums.length;
//         int cnt = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 int sum = 0;
//                 for (int l = i; l <= j; l++) {       //brute force solution
//                     sum += nums[l];
//                 }
//                 if (sum == k) {
//                     cnt++;
//                 }
//             }
//         }
//         return cnt;
//     }
// }
import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // base case

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
