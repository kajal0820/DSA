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
