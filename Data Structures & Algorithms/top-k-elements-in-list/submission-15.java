class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] list = new List[nums.length + 1];
        for (int i = 0; i < nums.length + 1; i++) {
            list[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list[entry.getValue()].add(entry.getKey());
        }
        int i = 0;
        int[] answer = new int[k];
        for (int l = list.length - 1; l >= 0; l--) {
            for (int j : list[l]) {
                answer[i++] = j;
                if (i == k) {
                    return answer;
                }
            }
        }
        return answer;
    }
}
