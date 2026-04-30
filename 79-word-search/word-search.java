class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int i, int j, String word, int idx) {
        // ✅ Base case
        if (idx == word.length()) {
            return true;
        }

        int m = board.length;
        int n = board[0].length;

        // Boundary + mismatch check
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != word.charAt(idx)) {
            return false;
        }

        // Mark visited
        char temp = board[i][j];
        board[i][j] = '#';

        // Explore 4 directions
        boolean found =
            dfs(board, i + 1, j, word, idx + 1) ||
            dfs(board, i - 1, j, word, idx + 1) ||
            dfs(board, i, j + 1, word, idx + 1) ||
            dfs(board, i, j - 1, word, idx + 1);

        // Backtrack
        board[i][j] = temp;

        return found;
    }
}