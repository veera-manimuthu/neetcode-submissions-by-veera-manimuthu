class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            int val = map.getOrDefault(n, 0) + 1;
            if (val > (nums.length / 2)) {
                return n;
            }
            map.put(n, val);
        }
        return -1;
    }
}