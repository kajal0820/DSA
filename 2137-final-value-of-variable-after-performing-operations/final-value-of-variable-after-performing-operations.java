class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String op : operations) {
            if (op.equals("++X") || op.equals("X++")) {
                X++; // increment
            } else if (op.equals("--X") || op.equals("X--")) {
                X--; // decrement
            }
        }
        return X;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] operations1 = {"--X","X++","X++"};
        System.out.println(sol.finalValueAfterOperations(operations1)); // Output: 1

        String[] operations2 = {"X++","++X","--X","X--"};
        System.out.println(sol.finalValueAfterOperations(operations2)); // Output: 0
    }
}