class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] maxLeftHeight = new int[len];
        int maxLeft = maxLeftHeight[0] = 0;
        for (int i = 1; i< len; i++) {
            maxLeft = maxLeftHeight[i] = Math.max(height[i-1], maxLeft);
        }

        int[] maxRightHeight = new int[len];
        int maxRight = maxRightHeight[len-1] = 0;
        for (int i = len -2; i >=0; i--) {
            maxRight = maxRightHeight[i] = Math.max(height[i+1], maxRight);
        }
        int totalTrap = 0;
        for (int i = 0; i< len; i++) {
           int trap = Math.min(maxLeftHeight[i], maxRightHeight[i]) - height[i];
           if (trap > 0) {
            totalTrap += trap;
           }
        }
        return totalTrap;
    }
}
