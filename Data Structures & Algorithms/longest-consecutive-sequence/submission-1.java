class Solution {
    public int longestConsecutive(int[] nums) {
        int answer = 0;
        Set<Integer> elems = new HashSet<>();
        for (int num : nums) elems.add(num);

        for (int num : elems) {
            int occ = 0;
            if (!elems.contains(num - 1)) {
                occ++;
                while (elems.contains(num + occ)) {
                    occ++;
                }
                answer = Math.max(answer, occ);
            }
        }
        return answer;
    }
}