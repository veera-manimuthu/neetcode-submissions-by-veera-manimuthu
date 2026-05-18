class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length-1;
        List<List<Integer>> answer = new ArrayList<>();
        for (int i =0; i <= len-2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
               continue;
            }
            int j = i+1, k = len;            
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;k--;
                    while (j < k && nums[j] == nums[j-1]) j++;
                    while (j < k && nums[k] == nums[k+1]) k--;                    
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return answer;
    }
}
