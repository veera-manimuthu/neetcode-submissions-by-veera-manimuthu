class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int j = i + 1;
            while (j < temperatures.length) {
                if (temperatures[i] < temperatures[j]) {
                    output[i] = j - i;
                    break;
                }
                j++;
            }
        }
        return output;
    }
}
