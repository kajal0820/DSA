class Solution {
    public int distributeCandies(int[] candyType) {
        int candies= candyType.length/2;
        
      HashSet<Integer> set = new HashSet<>();

for (int candy : candyType) {
    set.add(candy);
}
        int varities= set.size();
        if(candies == varities){
            return candies;
        }
        else if(varities>candies){
            return candies;
        }
        else {
            return varities;
        }
    }
}