class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> answer = new ArrayList<>();
        for (int i =0; i < len-2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                i++;
            }
            int j = i+1, k = len-1, target = nums[i];            
            while (j < k) {
                if (target + nums[j] + nums[k] == 0) {
                    answer.add(Arrays.asList(target, nums[j], nums[k]));
                    j++;k--;
                    while (j < k && nums[j] == nums[j+1]) j++;
                    while (j < k && nums[k-1] == nums[k]) k--;
                    
                } else if (target + nums[j] + nums[k] > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return answer;
    }
}
