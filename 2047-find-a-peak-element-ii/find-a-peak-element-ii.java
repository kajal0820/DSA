class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int curr = mat[i][j];

                if (curr > checkLeft(mat, i, j) &&
                    curr > checkRight(mat, i, j) &&
                    curr > checkTop(mat, i, j) &&
                    curr > checkBottom(mat, i, j)) {

                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1}; 
    }

    public int checkLeft(int[][] mat, int i, int j) {
        if (j - 1 < 0) return -1;
        return mat[i][j - 1];
    }

    public int checkRight(int[][] mat, int i, int j) {
        if (j + 1 >= mat[0].length) return -1;
        return mat[i][j + 1];
    }

    public int checkTop(int[][] mat, int i, int j) {
        if (i - 1 < 0) return -1;
        return mat[i - 1][j];
    }

    public int checkBottom(int[][] mat, int i, int j) {
        if (i + 1 >= mat.length) return -1;
        return mat[i + 1][j];
    }
}