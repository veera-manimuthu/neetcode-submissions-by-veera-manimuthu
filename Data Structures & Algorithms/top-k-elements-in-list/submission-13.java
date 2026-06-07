class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }
        int i = 0;
        int[] answer = new int[k];
        for (int j = bucket.length - 1; j >= 0; j--) {
            for (int key : bucket[j]) {
                answer[i++] = key;
                if (i == k) {
                    return answer;
                }
            }
        }
        return answer;
    }
}
