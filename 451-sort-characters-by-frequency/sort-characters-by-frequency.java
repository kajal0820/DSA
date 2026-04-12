import java.util.*;

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Create buckets
        List<Character>[] bucket = new List[s.length() + 1];

        for (char ch : map.keySet()) {
            int freq = map.get(ch);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(ch);
        }

        // Step 3: Build result (from high freq → low)
        StringBuilder ans = new StringBuilder();

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (char ch : bucket[i]) {
                    for (int j = 0; j < i; j++) {
                        ans.append(ch);
                    }
                }
            }
        }

        return ans.toString();
    }
}