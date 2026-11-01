class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            int currIdx = i;
            while (!stack.isEmpty() && stack.peek()[1] > heights[i]) {
                int[] top = stack.pop();
                int idx = top[0];
                int height = top[1];
                maxArea = Math.max(maxArea, height * (i - idx));
                currIdx = idx;
            }
            stack.push(new int[] {currIdx, heights[i]});
        }

        for (int[] top : stack) {
            maxArea = Math.max(maxArea, top[1] * (heights.length - top[0]));
        }
        return maxArea;
    }
}
