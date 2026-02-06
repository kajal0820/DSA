class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        return generate(nums, nums.length);
    }

    public List<List<Integer>> generate(int[] nums, int n) {

        // base case
        if (n == 0) {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>());
            return ans;
        }

        // recursion faith
        List<List<Integer>> faith = generate(nums, n - 1);

        // copy old subsets
        List<List<Integer>> result = new ArrayList<>(faith);

        // current element
        int num = nums[n - 1];

        // add current element to each subset
        for (List<Integer> list : faith) {
            List<Integer> newList = new ArrayList<>(list);
            newList.add(num);
            result.add(newList);
        }

        return result;
    }
}
