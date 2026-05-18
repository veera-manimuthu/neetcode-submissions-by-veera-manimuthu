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
            while (j < k && target <= 0) {                
                int twoSum = nums[j] + nums[k];
                if (twoSum + target == 0) {
                    elems.add(Arrays.asList(nums[j], nums[k], target));
                     k--;j++;
                } else if (twoSum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return elems;
    }
}
