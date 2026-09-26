class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int maxArea = 0;
        int left = 0, right = len - 1;
        while (left < right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            maxArea = Math.max(maxArea, height * width);
            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxArea;
    }
}
