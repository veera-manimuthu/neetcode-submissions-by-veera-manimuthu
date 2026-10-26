class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int start = i;
            while (!stack.isEmpty() && stack.peek()[0] > heights[i]) {
                int[] top = stack.pop();
                int h = top[0];
                int index = top[1];
                maxArea = Math.max(maxArea, h * (i - index));
                start = index;
            }
            stack.push(new int[] {heights[i], start});
        }
        for (int[] elem : stack) {
            int h = elem[0];
            int index = elem[1];
            maxArea = Math.max(maxArea, h * (heights.length - index));
        }
        return maxArea;
    }
}
