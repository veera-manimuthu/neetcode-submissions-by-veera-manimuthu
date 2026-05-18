class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> elems = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int start=0; start < len-2; start++) {
            if (start > 0 && nums[start-1] == nums[start]) {
                    continue;
                 }
            int j = start+1, k = len-1;
            int target = nums[start];                  
            while (j < k) {            
                  
                int twoSum = nums[j] + nums[k];
                if (twoSum + target == 0) {
                    elems.add(Arrays.asList(nums[start], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j+1]) j++;
                    while (j < k && nums[k] == nums[k-1]) k--;
                     k--;j++;
                } else if (twoSum + target > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return elems;
    }
}
