class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        List<Integer>[] bucket = new List<>[nums.length];
        for (int i = 0; i < nums.length; i++) bucket[i] = new ArrayList<>();

        for (Map.Entry<Integer, Integer> set : map.entrySet())
            bucket[set.getValue()].add(set.getKey());

        int[] answer = new int[k];
        int j = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] >= k) {
                for (int key : bucket[i]) {
                    answer[j++] = key;
                    if (j == k) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
