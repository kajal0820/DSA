import java.util.*;

class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            Map<Character, Integer> freq = new HashMap<>();
            int minFreq = Integer.MAX_VALUE;
            int maxFreq = 0;

            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);

                minFreq = Integer.MAX_VALUE;
                maxFreq = 0;

                for (int count : freq.values()) {
                    minFreq = Math.min(minFreq, count);
                    maxFreq = Math.max(maxFreq, count);
                }

                if (minFreq == maxFreq) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}
