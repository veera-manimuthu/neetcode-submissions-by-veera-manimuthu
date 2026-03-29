class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0, right = heights.length-1;
        while (left < right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            maxArea = Math.max(height * width, maxArea);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
