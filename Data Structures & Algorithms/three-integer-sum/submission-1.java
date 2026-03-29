class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();
        Arrays.sort(nums);
        if (nums.length < 3 || nums[0] > 0 || nums[nums.length-1] < 0) {
            return new ArrayList<>(answer);
        }
        int i = 0;
        while (i < nums.length-2) {
           int j = i+1, k = nums.length -1;
            while (j < k) {
                int sum = nums[j] + nums[k] + nums[i];
                if (sum == 0) {
                    List<Integer> elems = new ArrayList<>();
                    elems.add(nums[i]);elems.add(nums[j]);elems.add(nums[k]);
                    answer.add(elems);
                    j++;k--;
                } else if (sum > 0) {
                    k--;
                } else {                    
                    j++;
                }
                
            }
            i++;
        }
        return new ArrayList<>(answer);
    }
}
