class Solution {
    public int maxVowels(String s, int k) {

        int left = 0;
        int count = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (isVowel(ch)) {
                count++;
            }
            if (right - left + 1 > k) {
                if (isVowel(s.charAt(left))) {  // to exclude the leftvowel count , we aslo reduce the count of vowel counted at the left index 
                    count--;
                }
                left++; // and then we eventually shrink the array
            }
            if (right - left + 1 == k) {
                max = Math.max(max, count);
            }
        }
        return max;
    }

    private boolean isVowel(char ch) {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}