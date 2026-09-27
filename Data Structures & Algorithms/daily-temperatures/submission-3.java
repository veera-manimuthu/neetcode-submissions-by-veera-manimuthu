class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] result = new int[len];
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            int t = temperatures[i];
            while (!stack.isEmpty() && stack.peek()[1] < t) {
                int[] arr = stack.pop();
                result[arr[0]] = i - arr[0];
            }
            stack.push(new int[] {i, t});
        }
        return result;
    }
}
