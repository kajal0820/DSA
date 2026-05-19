import java.util.*;

class Solution {

    List<String> result = new ArrayList<>();

    Map<Character, String> phoneMap = new HashMap<>();

    public List<String> letterCombinations(String digits) {

        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");

        if (digits == null || digits.length() == 0) {
            return result;
        }

        backtrack(0, new StringBuilder(), digits);

        return result;
    }

    private void backtrack(int index, StringBuilder current, String digits) {

        // base case
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = phoneMap.get(digits.charAt(index));

        for (char letter : letters.toCharArray()) {

            current.append(letter); // choose

            backtrack(index + 1, current, digits); // explore

            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}