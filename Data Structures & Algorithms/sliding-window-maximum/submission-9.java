class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int j = 0;
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < nums.length; i++) {
            heap.offer(new int[] {nums[i], i});
            if (i + 1 >= k) {
                while (heap.peek()[1] <= i - k) {
                    heap.poll();
                }
                result[j++] = heap.peek()[0];
            }
        }
        return result;
    }
}
