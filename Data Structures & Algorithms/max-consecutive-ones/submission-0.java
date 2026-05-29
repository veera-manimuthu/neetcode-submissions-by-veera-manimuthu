class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer = 0, occ = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                occ++;
            } else {
                answer = Math.max(answer, occ);
                occ = 0;
            }
            if (i == nums.length - 1) {
                answer = Math.max(answer, occ);
            }
        }
        return answer;
    }
}