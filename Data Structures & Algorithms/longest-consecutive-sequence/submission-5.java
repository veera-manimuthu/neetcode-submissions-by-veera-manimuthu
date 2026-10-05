class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                int occ = 1;
                while (set.contains(++num)) {
                    occ++;
                }
                longest = Math.max(longest, occ);
            }
        }
        return longest;
    }
}
