class Solution {
    public List<List<Integer>> threeSum(int[] nums) {        
        Arrays.sort(nums);
        if (nums.length < 3 || nums[0] > 0 || nums[nums.length-1] < 0) {
            return new ArrayList<>();
        }
        int i = 0;
        List<List<Integer>> threeSum = new ArrayList<>();
        while (i < nums.length -2) {
            int j = i+1, k = nums.length -1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> ans = Arrays.asList(nums[i], nums[j], nums[k]);
                    if (!threeSum.contains(ans)) {
                        threeSum.add(ans);
                    }
                    k--;j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }                
            }
            i++;
        }
        return threeSum;
    }
}
