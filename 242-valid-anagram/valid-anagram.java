class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
       for (int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           hm1.put(ch,hm1.getOrDefault(ch,0) +1);
       }
       for (int i=0;i<t.length();i++){
           char ch = t.charAt(i);
           if (hm1.get(ch) != null){
               if (hm1.get(ch) == 1){
                    hm1.remove(ch);
               }
               else {
                   hm1.put(ch,hm1.get(ch)-1);
               }
           }
           else {
               return false;
           }
       }
      return hm1.isEmpty();
    }
}