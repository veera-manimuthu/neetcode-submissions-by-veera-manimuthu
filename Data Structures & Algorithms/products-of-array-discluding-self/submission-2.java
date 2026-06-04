class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftElems = new int[nums.length];
        leftElems[0] = 1;
        int leftProduct = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProduct = leftElems[i] = (leftProduct * nums[i - 1]);
        }
        int[] rightElems = new int[nums.length];
        int rightProduct = 1;
        rightElems[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightElems[i] = rightProduct * nums[i + 1];
            rightProduct = rightElems[i];
        }
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = leftElems[i] * rightElems[i];
        }
        return answer;
    }
}
