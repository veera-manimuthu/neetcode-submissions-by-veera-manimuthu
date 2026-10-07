class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0, l = 0, r = heights.length - 1;
        while (l < r) {
            int h = Math.min(heights[l], heights[r]);
            int w = r - l;
            maxArea = Math.max(maxArea, w * h);
            if (heights[l] > heights[r]) {
                r--;
            } else {
                l++;
            }
        }
        return maxArea;
    }
}
