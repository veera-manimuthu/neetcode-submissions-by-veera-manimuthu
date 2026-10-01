class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && stack.peek()[1] < temperatures[i]) {
                int[] ans = stack.pop();
                result[ans[0]] = i - ans[0];
            }
            stack.push(new int[] {i, temperatures[i]});
        }
        return result;
    }
}
