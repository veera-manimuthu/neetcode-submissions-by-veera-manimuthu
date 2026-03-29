class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> elements = new HashSet<>();
        for (int num : nums) {
            elements.add(num);
        }
        int answer = 0;
        for (int num : elements) {            
            if (!elements.contains(num-1)) {
                int seq = 1;
                while (elements.contains(++num)) {
                    seq++;
                }
                answer = Math.max(answer, seq);
            }           
        }
        return answer;
    }
}
