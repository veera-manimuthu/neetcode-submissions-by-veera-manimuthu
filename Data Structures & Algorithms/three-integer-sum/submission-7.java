class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length, i = 0;
        if (nums[0] > 0 || nums[len-1] < 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> answer = new ArrayList<>(); 
        while (i < len-2) {
            if (i > 0 && nums[i-1] == nums[i]) {
                i++;
                continue;
            }
            int j = i+1, k = len-1;
            while (j < k) {               
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j+1]) j++;
                    while (j < k && nums[k] == nums[k-1]) k--;
                    j++; k--;
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

