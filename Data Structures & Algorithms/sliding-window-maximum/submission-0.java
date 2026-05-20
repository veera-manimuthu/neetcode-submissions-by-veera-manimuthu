class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[nums.length-k+1];
        int currMax = Integer.MIN_VALUE, l = 0, ansIdx=0;
        for (int r =0; r < nums.length; r++) {
            map.put(r, nums[r]);
            currMax = Math.max(currMax, nums[r]);
            if (r-l+1 == k) {
                answer[ansIdx++] = currMax;
                if (map.get(l) == currMax) {
                    int maxCurrVal = Integer.MIN_VALUE;
                    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                        if (entry.getKey() != l) {
                            maxCurrVal = Math.max(maxCurrVal, entry.getValue());
                        }
                    }
                    currMax = maxCurrVal;
                }
                map.remove(l);
                l++;
            }
        }
        return answer;
    }
}
