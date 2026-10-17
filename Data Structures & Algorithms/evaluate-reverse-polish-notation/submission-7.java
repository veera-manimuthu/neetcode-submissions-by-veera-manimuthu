class Solution {
    public int evalRPN(String[] tokens) {
        List<String> operators = Arrays.asList("+", "-", "/", "*");
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (operators.contains(token)) {
                int top = stack.pop();
                int prev = stack.pop();
                if ("+".equals(token)) {
                    stack.push(prev + top);
                } else if ("-".equals(token)) {
                    stack.push(prev - top);
                } else if ("*".equals(token)) {
                    stack.push(prev * top);
                } else {
                    stack.push(prev / top);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
