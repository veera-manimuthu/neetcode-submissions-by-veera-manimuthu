class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (Integer num : set) {
            int occur = 0;
            if (!set.contains(num - 1)) {
                occur = 1;
                while (set.contains(++num)) {
                    occur++;
                }
                longest = Math.max(longest, occur);
            }
        }
        return longest;
    }
}
