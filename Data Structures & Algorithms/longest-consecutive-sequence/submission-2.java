class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int answer = 0;
        for (int val : set) {
            int curr = 0;
            if (!set.contains(val - 1)) {
                curr++;
                while (set.contains(++val)) {
                    curr++;
                }
                answer = Math.max(curr, answer);
            }
        }
        return answer;
    }
}
