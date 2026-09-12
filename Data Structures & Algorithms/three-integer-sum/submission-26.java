class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int i = 0;
        List<List<Integer>> answer = new ArrayList<>();
        while (i < nums.length - 2) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int threeSum = nums[i] + nums[j] + nums[k];
                if (threeSum == 0) {
                    answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[i] == nums[j]) {
                        j++;
                    }
                    while (j < k && nums[j] == nums[k]) {
                        k--;
                    }
                } else if (threeSum > 0) {
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
