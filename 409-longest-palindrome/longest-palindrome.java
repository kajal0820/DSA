class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==0)
        return 0;
        HashSet<Character> set= new HashSet<>();
        int length=0;
       for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    if(set.contains(c)){
        set.remove(c);
        length+=2;

        }else {
            set.add(c);
        }
    }
    if(!set.isEmpty()){
  length += 1; 
        }

        return length;
    }
}