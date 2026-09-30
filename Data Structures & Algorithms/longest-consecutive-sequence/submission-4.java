class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int answer = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int occ = 1;
                while (set.contains(++num)) {
                    occ++;
                }
                answer = Math.max(answer, occ);
            }
        }
        return answer;
    }
}
