class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        int l = 0, r = 0, len = nums.length;
        while (l < len) {
            while (r < len) {
                currSum += nums[r];
                if (currSum < 0) {
                    maxSum = Math.max(maxSum, currSum);
                    currSum = 0;
                    l = r+1;
                } else {
                    maxSum = Math.max(maxSum, currSum);
                }                
                r++;
            }
            l++;     
        }
        return maxSum;
    }
}
