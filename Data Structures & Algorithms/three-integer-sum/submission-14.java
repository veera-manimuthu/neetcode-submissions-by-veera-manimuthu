class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] > 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        while ( i < nums.length -2) {
            if (i > 0 && nums[i] == nums[i-1]) {
                i++;
                continue;
            }
            int j = i+1, k = nums.length-1;
            while (j < k) {
                int sum =  nums[i]+ nums[j]+nums[k];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                   while (j < k && nums[k] == nums[k+1]) {
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
        return ans;
    }
}
