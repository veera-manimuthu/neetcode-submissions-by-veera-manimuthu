class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i < nums.length + 1; i++) bucket[i] = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            bucket[entry.getValue()].add(entry.getKey());

        int counter = 0;
        int[] freq = new int[k];
        for (int i = bucket.length - 1; i >= 0; i--) {
            for (int res : bucket[i]) {
                freq[counter++] = res;
                if (counter == k) {
                    return freq;
                }
            }
        }
        return freq;
    }
}
