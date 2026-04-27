class Solution {
    public int compress(char[] chars) {
        int write = 0; 
        int count = 1;

        for (int i = 0; i < chars.length; i++) {

            if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
            } else {
                chars[write++] = chars[i];
                if (count > 1) {
                    String cnt = String.valueOf(count);
                    for (char c : cnt.toCharArray()) {
                        chars[write++] = c;
                    }
                }

                count = 1;
            }
        }

        return write;
    }
}