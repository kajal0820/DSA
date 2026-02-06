class Solution {

    public List<String> generateParenthesis(int n) {

        // base case
        if (n == 1) {
            List<String> base = new ArrayList<>();
            base.add("()");
            return base;
        }

        // faith: get answer for n-1
        List<String> faith = generateParenthesis(n - 1);

        // use set to avoid duplicates
        Set<String> answer = new HashSet<>();

        // build answer from smaller subproblem
        for (String s : faith) {
            for (int i = 0; i <= s.length(); i++) {
                String newStr = s.substring(0, i) + "()" + s.substring(i);
                answer.add(newStr);
            }
        }

        return new ArrayList<>(answer);
    }
}
