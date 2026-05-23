class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new LinkedList<>();
        int[] answer = new int[nums.length-k+1];
        int l=0, r = 0, n = nums.length, idx=0;
        while (r < n) {            
            while (!q.isEmpty() && nums[r] > nums[q.getFirst()] ) {
              q.removeFirst();
            }
            if (!q.isEmpty() && nums[r] < nums[q.getFirst()]) {
              q.addFirst(r);
            } else {
              q.addLast(r);
            }
            if (r+1 >= k) {
              answer[idx++] = nums[q.getLast()];
            }
            r++;
        }
        return answer;
    }
}
