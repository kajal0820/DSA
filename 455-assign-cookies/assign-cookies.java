//you cannot:

// combine multiple cookies for one child
// split one cookie among multiple children

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
      int child = 0;
      int cookies= 0;
      while(child <g.length && cookies<s.length){
        if(g[child]<=s[cookies]){
            child++;
        }
        cookies++;
      }
      return child;
        
    }
}