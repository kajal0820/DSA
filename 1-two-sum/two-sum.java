// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int ans[] = new int[2];
//         for(int i =0;i<nums.length;i++){
//             for(int j =i+1;j<nums.length;j++){
//                 if(nums[i]+ nums[j]== target){
//                     ans[0]=i;
//                     ans[1]=j;
//                     return ans;
//                 }
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        int num= 0;
        for(int i =0;i<nums.length;i++){
            num = target - nums[i];
            if(map.containsKey(num)){
                ans[0]= map.get(num);
                ans[1]= i;
                return ans;
            }
           map.put(nums[i],i);
            }
            
            return ans;
        }
    }
