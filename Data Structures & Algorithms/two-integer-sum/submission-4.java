class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        int[] answer = new int[2];
        for (int num : nums) {           
           int value = target - num;
           if (map.containsKey(value)) {
                answer[0] = map.get(value);
                answer[1] = index;
                return answer;
           }
           map.put(num, index);
           index++;
        }
        return answer;
    }
}
