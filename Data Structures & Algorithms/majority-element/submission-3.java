class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int elem = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                elem = nums[i];
            }
            if (elem != nums[i]) {
                count--;
            } else {
                count++;
            }
        }
        return elem;
    }
}