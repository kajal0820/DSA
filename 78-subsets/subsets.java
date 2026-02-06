// class Solution {

//     public List<List<Integer>> subsets(int[] nums) {
//         return generate(nums, nums.length);
//     }

//     public List<List<Integer>> generate(int[] nums, int n) {

//         // base case
//         if (n == 0) {
//             List<List<Integer>> ans = new ArrayList<>();
//             ans.add(new ArrayList<>());
//             return ans;
//         }

//         // recursion faith
//         List<List<Integer>> faith = generate(nums, n - 1);

//         // copy old subsets
//         List<List<Integer>> result = new ArrayList<>(faith);

//         // current element
//         int num = nums[n - 1];

//         // add current element to each subset
//         for (List<Integer> list : faith) {
//             List<Integer> newList = new ArrayList<>(list);
//             newList.add(num);
//             result.add(newList);
//         }

//         return result;
//     }
// }
class Solution {

    List<List<Integer>> answer = new ArrayList<>();
    int n;

    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        generate(nums, new ArrayList<>(), 0);
        return answer;
    }

    public void generate(int[] arr, List<Integer> list, int i) {

        // base case
        if (i == n) {
            answer.add(new ArrayList<>(list));
            return;
        }

        // 1️⃣ include current element
        list.add(arr[i]);
        generate(arr, list, i + 1);

        // backtrack
        list.remove(list.size() - 1);

        // 2️⃣ exclude current element
        generate(arr, list, i + 1);
    }
}
