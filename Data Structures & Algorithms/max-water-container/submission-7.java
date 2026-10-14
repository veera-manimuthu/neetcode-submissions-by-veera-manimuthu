class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0, right = heights.length - 1;
        while (left < right) {
            int h = Math.min(heights[left], heights[right]);
            int w = right - left;
            maxArea = Math.max(w * h, maxArea);
            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxArea;
    }
}
