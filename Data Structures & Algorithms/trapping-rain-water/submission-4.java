class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] left = new int[len];
        int leftMax = 0;
        left[0] = 0;
        for (int i = 1; i < len; i++) {
            leftMax = Math.max(height[i - 1], leftMax);
            left[i] = leftMax;
        }
        int[] right = new int[len];
        int rightMax = 0;
        right[len - 1] = 0;
        for (int i = len - 2; i >= 0; i--) {
            rightMax = Math.max(height[i + 1], rightMax);
            right[i] = rightMax;
        }
        int totalTrap = 0;
        for (int i = 0; i < len; i++) {
            int h = Math.min(left[i], right[i]);
            if (h - height[i] > 0) {
                totalTrap += (h - height[i]);
            }
        }
        return totalTrap;
    }
}
