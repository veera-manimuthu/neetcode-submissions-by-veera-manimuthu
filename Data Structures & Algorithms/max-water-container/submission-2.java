class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1, maxArea = Integer.MIN_VALUE;
        while (l < r) {
            int ht = Math.min(heights[l], heights[r]);
            int wdth = r - l;
            maxArea = Math.max(maxArea, ht * wdth);
            if (heights[l] > heights[r]) {
                r--;
            } else {
                l++;
            }
        }
        return maxArea;
    }
}
