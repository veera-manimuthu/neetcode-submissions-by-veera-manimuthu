class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longestConsecutive = 0;
        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            int curr = 0;
            if (!set.contains(num - 1)) {
                curr++;
                while (set.contains(++num)) {
                    curr++;
                }
                longestConsecutive = Math.max(longestConsecutive, curr);
            }
        }
        return longestConsecutive;
    }
}
