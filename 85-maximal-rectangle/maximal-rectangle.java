import java.util.*;

class Solution {

    private int maxRect(int[] height) {
        Stack<Integer> st = new Stack<>();
        int n = height.length;
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {

            while (!st.isEmpty() &&
                  (i == n || height[st.peek()] >= height[i])) {

                int h = height[st.pop()];

                int left = st.isEmpty() ? -1 : st.peek();

                int width = i - left - 1;

                maxArea = Math.max(maxArea, h * width);
            }

            if (i < n) {
                st.push(i);
            }
        }

        return maxArea;
    }

    public int maximalRectangle(char[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] height = new int[cols];
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == '1') {
                    height[j]++;
                } else {
                    height[j] = 0;
                }
            }

            maxArea = Math.max(maxArea, maxRect(height));
        }

        return maxArea;
    }
}