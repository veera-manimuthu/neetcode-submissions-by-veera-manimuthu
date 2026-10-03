class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];
            while (!stack.isEmpty() && stack.peek()[1] < t) {
                int[] prev = stack.pop();
                result[prev[0]] = i - prev[0];
            }
            stack.push(new int[] {i, t});
        }
        return result;
    }
}
