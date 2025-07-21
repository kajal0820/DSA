import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        

//         for(int i=0;i<=nums.length;i++){
//             for(int j=0;j<=nums.length;j++){
//                 if(nums[i] + nums[j] == target) {
//                     return new int[] {i, j};  // Return the indices
//                 }
//             }
//         }
//         return new int[] {};
//     }
// }
HashMap<Integer,Integer> numMap= new HashMap<>();
int[] ans = new int[2];
for(int i=0;i<nums.length;i++){
    int currentNum= nums[i];
    int othernum= target-currentNum;
    if(numMap.containsKey(othernum)){
        ans[0]=numMap.get(othernum);
        ans[1]=(i);
        return ans;
    }
    
            numMap.put(currentNum, i);
        }
        return new int[] {};
    }
}
  
