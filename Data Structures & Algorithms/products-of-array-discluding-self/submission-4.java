class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int product = 1;
        left[0] = 1;
        for (int i = 1; i < len; i++) {
            product *= nums[i - 1];
            left[i] = product;
        }
        int[] right = new int[len];
        product = 1;
        right[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            product *= nums[i + 1];
            right[i] = product;
        }
        int[] output = new int[len];
        for (int i = 0; i < len; i++) {
            output[i] = left[i] * right[i];
        }
        return output;
    }
}
