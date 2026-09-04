class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftArr = new int[nums.length];
        int product = 1;
        leftArr[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            product *= nums[i - 1];
            leftArr[i] = product;
        }
        int[] rightArr = new int[nums.length];
        product = 1;
        rightArr[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            product *= nums[i + 1];
            rightArr[i] = product;
        }
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = leftArr[i] * rightArr[i];
        }
        return answer;
    }
}
