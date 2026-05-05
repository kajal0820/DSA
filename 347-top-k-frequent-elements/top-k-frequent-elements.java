class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: count frequency
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: convert to list
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // Step 3: sort by frequency descending
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Step 4: pick top k
        int[] result = new int[k];
        for(int i = 0; i < k && i < list.size(); i++){
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}