class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> ansAsList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= k) {
                ansAsList.add(entry.getKey());
            }
        }
        int[] ans = new int[ansAsList.size()];
        int i = 0;
        for (Integer elem : ansAsList) {
            ans[i++] = elem.intValue();
        }
        return ans;
    }
}
