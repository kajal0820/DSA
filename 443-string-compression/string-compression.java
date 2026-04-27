class Solution {
    public int compress(char[] chars) {
        int write = 0; 
        int count = 1;

        for (int i = 0; i < chars.length; i++) {

            if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
            } else {
                chars[write] = chars[i];
                write++;
                if (count > 1) {
                    String cnt = String.valueOf(count); // converts number to string
                    for (char c : cnt.toCharArray()) {  //Converts string → char array
                        chars[write] = c; //Loop through each digit
                        write++;  //Write each digit into original array
                    }
                }

                count = 1;
            }
        }

        return write;
    }
}