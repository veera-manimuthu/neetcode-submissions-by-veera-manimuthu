class Solution {
    public int evalRPN(String[] tokens) {
        List<String> operators = Arrays.asList("+", "-", "*", "/");
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (operators.contains(token)) {
                int recent = stack.pop();
                int prev = stack.pop();
                if ("+".equals(token)) {
                    stack.push(recent + prev);
                }else if ("-".equals(token)) {
                    stack.push(prev - recent);
                } else if ("*".equals(token)) {
                    stack.push(recent * prev);
                } else if ("/".equals(token)) {
                    stack.push(prev / recent);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
