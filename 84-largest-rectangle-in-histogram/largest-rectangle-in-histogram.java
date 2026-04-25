// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int n = heights.length;
//         int maxArea = 0;

//         for (int i = 0; i < n; i++) {
//             int minHeight = heights[i];

//             for (int j = i; j < n; j++) {
//                 minHeight = Math.min(minHeight, heights[j]);
//                 int width = j - i + 1;
//                 maxArea = Math.max(maxArea, minHeight * width);
//             }
//         }

//         return maxArea;
//     }
// }
        import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while (!st.isEmpty() && currHeight < heights[st.peek()]) {
                int height = heights[st.pop()];

                int right = i;
                int left = st.isEmpty() ? -1 : st.peek();

                int width = right - left - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            st.push(i);
        }

        return maxArea;
    }
}