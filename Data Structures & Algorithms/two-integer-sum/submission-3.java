class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i< nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(target-num)) {
                answer[0] = map.get(target-num);
                answer[1] = i;
                break;
            } 
            map.put(num, i);            
        }
        return answer;
    }
}
