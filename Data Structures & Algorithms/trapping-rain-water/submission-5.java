class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int maxLeftHeight = 0;
        for (int i = 1; i < height.length; i++) {
            maxLeftHeight = Math.max(maxLeftHeight, height[i - 1]);
            left[i] = maxLeftHeight;
        }
        int[] right = new int[height.length];
        int maxRightHeight = 0;
        for (int i = height.length - 2; i >= 0; i--) {
            maxRightHeight = Math.max(maxRightHeight, height[i + 1]);
            right[i] = maxRightHeight;
        }
        int trap = 0;
        for (int i = 0; i < height.length; i++) {
            int currTrap = Math.min(left[i], right[i]);
            if (currTrap - height[i] > 0) {
                trap += (currTrap - height[i]);
            }
        }
        return trap;
    }
}
