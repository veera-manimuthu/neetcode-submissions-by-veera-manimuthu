class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int i = 0, len = nums.length-1;
        while (i < len - 1) {
            while (i > 0 && i < len - 1 && nums[i-1] == nums[i]) {
                i++;
            }
            int j = i+1, k = len;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; k--;
                    while (j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                    while (k < len && j < k && nums[k] == nums[k+1]) {
                        k--;
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
