class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftNums = new int[nums.length];
        int leftProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                leftNums[i] = leftProduct * nums[i - 1];
            } else {
                leftNums[i] = leftProduct;
            }
            leftProduct = leftNums[i];
        }
        int[] rightNums = new int[nums.length];
        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                rightNums[i] = rightProduct;
            } else {
                rightNums[i] = rightProduct * nums[i + 1];
            }
            rightProduct = rightNums[i];
        }
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = leftNums[i] * rightNums[i];
        }
        return answer;
    }
}
