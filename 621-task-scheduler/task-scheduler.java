class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        // count frequency
        for(char ch : tasks){
            freq[ch - 'A']++;
        }

        int maxFreq = 0;

        // find maximum frequency
        for(int f : freq){
            maxFreq = Math.max(maxFreq, f);
        }

        int maxCount = 0;

        // count how many tasks have max frequency
        for(int f : freq){
            if(f == maxFreq){
                maxCount++;
            }
        }

        int slots = (maxFreq - 1) * (n + 1) + maxCount;

        return Math.max(tasks.length, slots);
    }
}