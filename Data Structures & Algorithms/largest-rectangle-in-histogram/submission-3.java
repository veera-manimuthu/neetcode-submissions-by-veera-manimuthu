class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            int start = i;
            while (!stack.isEmpty() && stack.peek()[0] > heights[i]) {
                int[] top = stack.pop();
                int height = top[0];
                int idx = top[1];
                maxArea = Math.max(maxArea, height * (i - idx));
                start = idx;
            }
            stack.push(new int[] {heights[i], start});
        }

        for (int[] pair : stack) {
            int height = pair[0];
            int idx = pair[1];
            maxArea = Math.max(maxArea, height * (heights.length - idx));
        }
        return maxArea;
    }
}
