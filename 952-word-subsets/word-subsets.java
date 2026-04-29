class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        
        int[] maxFreq = new int[26];
        
        
        for (String word : words2) {
            int[] freq = new int[26];
            
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }
            
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }
        
        // Step 2: Check each word in words1
        for (String word : words1) {
            int[] freq = new int[26];
            
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }
            
            boolean isValid = true;
            
            for (int i = 0; i < 26; i++) {
                if (freq[i] < maxFreq[i]) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) ans.add(word);
        }
        
        return ans;
    }
}