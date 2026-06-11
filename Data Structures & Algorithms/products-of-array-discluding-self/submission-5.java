class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int leftMax = 1;
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftMax = (nums[i - 1] * leftMax);
            left[i] = leftMax;
        }
        int[] right = new int[nums.length];
        int rightMax = 1;
        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightMax = (nums[i + 1] * rightMax);
            right[i] = rightMax;
        }
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = (left[i] * right[i]);
        }
        return answer;
    }
}
