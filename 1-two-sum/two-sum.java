class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hp = new HashMap<>();
    for(int i =0;i<nums.length;i++){
        int complement = target-nums[i];
        if(hp.containsKey(complement)){
            return new int[]{hp.get(complement),i};
        }
        hp.put(nums[i],i);
        }
        return new int[]{};
        
        }  
          }
//         for(int i =0;i<nums.length;i++){
//             for(int j =i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{};
      
//     }
// }