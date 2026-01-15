import java.util.Stack;

class Solution {
    public String removeOuterParentheses(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);  //if stack is empty dont add the character in ans and if the char is ) then pop it 
                
                if (stack.size() > 1) {
                    ans.append(ch);
                }
            } else {  //char=')'
                stack.pop();
                
                if (stack.size() >= 1) {
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}
