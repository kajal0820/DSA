class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> anagrams = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!anagrams.containsKey(key)){
                anagrams.put(key, new ArrayList<>());
            }
            anagrams.get(key).add(s);        
        }
        return new ArrayList(anagrams.values());
    }
}
