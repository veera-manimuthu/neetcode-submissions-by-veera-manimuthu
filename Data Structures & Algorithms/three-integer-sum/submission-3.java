class Solution {
    public List<List<Integer>> threeSum(int[] nums) {        
        Arrays.sort(nums);
        if (nums.length < 3 || nums[0] > 0 || nums[nums.length-1] < 0) {
            return new ArrayList<>();
        }
        int i = 0;
        Set<List<Integer>> threeSum = new HashSet<>();
        while (i < nums.length -2) {
            int j = i+1, k = nums.length -1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> elems = new ArrayList<>();
                    elems.add(nums[i]);elems.add(nums[j]);elems.add(nums[k]);
                    threeSum.add(elems);
                     k--;j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }                
            }
            i++;
        }
        return new ArrayList<>(threeSum);
    }
}
