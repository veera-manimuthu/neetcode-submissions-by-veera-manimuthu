class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftPass = new int[nums.length];
        int leftProduct = 1;
        leftPass[0] = 1;
        for (int i = 1; i < leftPass.length; i++) {
            leftProduct *= nums[i - 1];
            leftPass[i] = leftProduct;
        }
        int[] rightPass = new int[nums.length];
        int rightProduct = 1;
        rightPass[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightProduct *= nums[i + 1];
            rightPass[i] = rightProduct;
        }
        int[] answer = new int[nums.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = leftPass[i] * rightPass[i];
        }
        return answer;
    }
}
