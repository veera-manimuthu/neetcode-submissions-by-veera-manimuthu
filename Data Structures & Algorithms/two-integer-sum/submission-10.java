class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int num : nums) {
            int key = target - num;
            if (map.containsKey(key)) {
                return new int[] {map.get(key), idx};
            }
            map.put(num, idx++);
        }
        return new int[] {-1, -1};
    }
}
