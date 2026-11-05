class Solution {
    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int max = 0;
        for (int i = 1; i < height.length; i++) {
            max = Math.max(max, height[i - 1]);
            maxLeft[i] = max;
        }
        int[] maxRight = new int[height.length];
        max = 0;
        for (int i = height.length - 2; i >= 0; i--) {
            max = Math.max(max, height[i + 1]);
            maxRight[i] = max;
        }
        int trap = 0;
        for (int i = 0; i < height.length; i++) {
            int currTrap = Math.min(maxLeft[i], maxRight[i]) - height[i];
            if (currTrap > 0) {
                trap += currTrap;
            }
        }
        return trap;
    }
}
