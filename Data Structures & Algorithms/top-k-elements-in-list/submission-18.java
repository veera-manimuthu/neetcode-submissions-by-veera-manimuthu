class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for (int i=0; i <nums.length+1; i++) {
            bucket[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }
        int[] result = new int[k];
        int idx = 0;
        for (int i=bucket.length-1; i >=0; i--) {
            for (int elem : bucket[i]) {
                result[idx++] = elem;
                if (idx == k) {
                    return result;
                }
            }
        }
        return result;
    }
}
