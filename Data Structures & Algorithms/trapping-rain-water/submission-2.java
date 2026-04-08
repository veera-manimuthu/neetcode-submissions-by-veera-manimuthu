class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] maxLeftHeight = new int[len];
        maxLeftHeight[0] = 0;
        int maxLHeight = maxLeftHeight[0];
        for (int i=1; i < len; i++) {
            maxLHeight = Math.max(maxLHeight, height[i-1]);
            maxLeftHeight[i] = maxLHeight;
        }

        int[] maxRightHeight = new int[len];
        maxRightHeight[len-1] = 0;
        int maxRHeight = maxRightHeight[len-1];
        for (int i = len -2; i>=0; i--) {
            maxRHeight = Math.max(maxRHeight, height[i+1]);
            maxRightHeight[i] = maxRHeight;
        }

        int answer = 0;
        for (int i=0; i<len; i++) {
            int h = Math.min(maxLeftHeight[i], maxRightHeight[i]);
             int trap = h - height[i];
             if (trap > 0) {
                answer += trap;
             }
        }
        return answer;
    }
}
