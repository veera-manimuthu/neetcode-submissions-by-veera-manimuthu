class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> distinctNumbers = new HashSet<>();
        for (int num : nums) {
            if (!distinctNumbers.add(num)) {
                return true;
            }
        }
        return false;
    }
}