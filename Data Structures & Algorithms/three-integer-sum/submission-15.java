class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        int i =0, len = nums.length;
        while (i < len - 2) {
            if (i > 0 && nums[i] == nums[i-1]) {
                i++;
                continue;
            }
            int j = i+1, k = len-1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (nums[j] == nums[j-1]) {
                        j++;
                    }
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
            i++;
        }
        return answer;
    }
}
