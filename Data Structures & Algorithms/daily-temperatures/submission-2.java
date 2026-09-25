class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];
            while (!stack.isEmpty() && t > stack.peek()[1]) {
                int[] arr = stack.pop();
                result[arr[0]] = i - arr[0];
            }
            stack.push(new int[] {i, t});
        }
        return result;
    }
}
