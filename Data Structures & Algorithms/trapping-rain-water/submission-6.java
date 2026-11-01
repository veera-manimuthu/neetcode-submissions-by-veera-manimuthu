class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int left = 0;
        for (int i = 1; i < height.length; i++) {
            left = Math.max(left, height[i - 1]);
            leftMax[i] = left;
        }
        int[] rightMax = new int[height.length];
        int right = 0;
        for (int i = height.length - 2; i >= 0; i--) {
            right = Math.max(right, height[i + 1]);
            rightMax[i] = right;
        }
        int trap = 0;
        for (int i = 0; i < height.length; i++) {
            int currTrap = Math.min(leftMax[i], rightMax[i]) - height[i];
            if (currTrap > 0) {
                trap += currTrap;
            }
        }
        return trap;
    }
}
