class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
 // Step 1: Traverse borders
        for (int i = 0; i < m; i++) {
            dfs(board, i, 0);       // left column
            dfs(board, i, n - 1);   // right column
        }
        for (int j = 0; j < n; j++) {
            dfs(board, 0, j);       // top row
            dfs(board, m - 1, j);   // bottom row
        }
        // Step 2: Convert
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';   // surrounded
                } else if (board[i][j] == '#') {
                    board[i][j] = 'O';   // restore safe
                }
            }
        }
    }
    public void dfs(char[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;
         // Boundary + condition
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != 'O') {
            return;
        }
        // Mark safe
        board[i][j] = '#';
        // Explore 4 directions
        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }
}