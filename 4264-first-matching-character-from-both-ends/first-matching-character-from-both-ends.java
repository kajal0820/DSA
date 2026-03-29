class Solution {
    public int firstMatchingIndex(String s) {
        int right = 0;
        int left = s.length() - 1;

        while (right <= left) {
            if (s.charAt(right) == s.charAt(left)) {
                return right;
            }
            right++;
            left--;
        }

        return -1;
    }
}