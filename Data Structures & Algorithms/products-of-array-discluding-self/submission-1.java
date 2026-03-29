class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] lToR = new int[nums.length];
        int product = nums[0];
        lToR[0] = 1;
        for (int i=1; i < nums.length; i++) {
            lToR[i] = product;
            product *= nums[i];
        }
        int[] rToL = new int[nums.length];
        rToL[nums.length-1] = 1;
        product = nums[nums.length-1];
        for (int i = nums.length-2; i >=0; i--) {
            rToL[i] = product;
            product *= nums[i];
        }
        int[] answer = new int[nums.length];
        for (int i=0; i < nums.length; i++) {
            answer[i] = lToR[i] * rToL[i];
        }
        return answer;
    }
}  
