class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            int temp = temperatures[i];
            int j = i + 1;
            while (j < len) {
                if (temp < temperatures[j]) {
                    result[i] = j - i;
                    break;
                }
                j++;
            }
        }
        return result;
    }
}
