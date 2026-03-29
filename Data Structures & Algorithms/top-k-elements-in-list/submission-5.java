class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (Map.Entry<Integer, Integer> row : map.entrySet()) {
            queue.offer(new int[] {row.getValue(), row.getKey()});
            if (queue.size() > k) {
                queue.poll();
            }
        }
        int[] ans = new int[k];
        int j=0;
        for (int i=0; i<k; i++) {
            ans[j] = queue.poll()[1];
            j++;
        }
        return ans;
    }
}
