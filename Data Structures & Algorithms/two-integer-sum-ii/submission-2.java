class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length-1, i = 0;
        while (i < len) {
            int sum = numbers[i] + numbers[len];
            if (sum == target) {
                return new int[] { i +1, len+1};
            } else if (sum > target) {
                len--;
            } else {
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}
