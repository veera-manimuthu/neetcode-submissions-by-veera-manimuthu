class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i < nums.length + 1; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] ans = new int[k];
        int i = 0;
        for (int j = bucket.length - 1; j >= 0; j--) {
            for (int l : bucket[j]) {
                ans[i++] = l;
                if (i == k) {
                    return ans;
                }
            }
        }
        return new int[] {0};
    }
}
