class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0, left = 0, right = heights.length-1;
        while (left < right && right <= heights.length) {
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
