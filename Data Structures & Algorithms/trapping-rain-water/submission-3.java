class Solution {
    public int trap(int[] height) {
        int[] leftArr = new int[height.length];
        int maxLeftArr = 0;  
        for (int i = 1; i < height.length; i++) {
            leftArr[i] = maxLeftArr = Math.max(height[i-1], maxLeftArr);
        }
        int[] rightArr = new int[height.length];
        int maxRightA = 0;
        for (int i = height.length-2; i >=0; i--) {
            rightArr[i] = maxRightA = Math.max(height[i+1], maxRightA);
        }
        int answer = 0;
        for (int i=0; i < height.length; i++) {
            int maxHeight = Math.min(leftArr[i], rightArr[i]);
            int trap = maxHeight - height[i]; 
            if (trap > 0) {
                answer += trap;
            }
        }
        return answer;
    }
}
