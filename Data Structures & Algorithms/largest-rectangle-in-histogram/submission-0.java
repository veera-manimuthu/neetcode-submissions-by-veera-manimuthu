class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int h = heights[i];
            int rightLen = i + 1;
            while (rightLen < heights.length && h <= heights[rightLen]) {
                rightLen++;
            }
            int leftLen = i;
            while (leftLen >= 0 && h <= heights[leftLen]) {
                leftLen--;
            }
            rightLen--;
            leftLen++;
            maxArea = Math.max(maxArea, h * (rightLen - leftLen + 1));
        }
        return maxArea;
    }
}
