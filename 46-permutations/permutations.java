import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return generate(nums, nums.length - 1);
    }

    public List<List<Integer>> generate(int[] nums, int index) {

        // Base Case
        if (index == 0) {
            List<List<Integer>> base = new ArrayList<>();
            List<Integer> first = new ArrayList<>();
            first.add(nums[0]);
            base.add(first);
            return base;
        }

        // Faith
        List<List<Integer>> faith = generate(nums, index - 1);

        List<List<Integer>> answer = new ArrayList<>();

        // Current element to insert
        int element = nums[index];

        // Insert element at all positions of each permutation
        for (List<Integer> list : faith) {
            for (int pos = 0; pos <= list.size(); pos++) {
                List<Integer> newList = new ArrayList<>(list);
                newList.add(pos, element);
                answer.add(newList);
            }
        }

        return answer;
    }
}
