class Solution {
    public int compress(char[] chars) {

        int write = 0; // where to write
        int read = 0;  // where to read

        while(read < chars.length) {

            char current = chars[read];
            int count = 0;

            // count same characters
            while(read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            // write character
            chars[write++] = current;

            // write count if > 1
            if(count > 1) {
                String num = String.valueOf(count);
                for(char c : num.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}