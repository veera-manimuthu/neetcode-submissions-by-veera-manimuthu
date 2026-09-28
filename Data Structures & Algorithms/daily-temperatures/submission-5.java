class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] result = new int[len];
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            int temp = temperatures[i];
            while (!stack.isEmpty() && stack.peek()[1] < temp) {
                int[] prev = stack.pop();
                result[prev[0]] = i - prev[0];
            }
            stack.push(new int[] {i, temp});
        }
        return result;
    }
}
