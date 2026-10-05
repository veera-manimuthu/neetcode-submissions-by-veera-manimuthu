class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, n = numbers.length - 1;
        while (i < n) {
            if (numbers[i] + numbers[n] == target) {
                return new int[] {i + 1, n + 1};
            } else if (numbers[i] + numbers[n] > target) {
                n--;
            } else {
                i++;
            }
        }
        return new int[] {-1, -1};
    }
}
