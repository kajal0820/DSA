class Solution {
    public int largestPalindrome(int n) {
        if (n == 1) return 9;

        int upper = (int)Math.pow(10, n) - 1;
        int lower = (int)Math.pow(10, n - 1);

        for (int left = upper; left >= lower; left--) {
           
            long palindrome = createPalindrome(left);
            for (long i = upper; i * i >= palindrome; i--) {
                if (palindrome % i == 0) {
                    return (int)(palindrome % 1337);
                }
            }
        }
        return -1;
    }

    private long createPalindrome(int num) {
        long pal = num;
        int temp = num;

        while (temp > 0) {
            pal = pal * 10 + (temp % 10);
            temp /= 10;
        }
        return pal;
    }
}