class Solution {
    public int evalRPN(String[] tokens) {
        List<String> exprns = Arrays.asList("+", "-", "*", "/");
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (exprns.contains(token)) {
                int top = stack.pop();
                int first = stack.pop();
                if ("+".equals(token)) {
                    stack.push(first + top);
                } else if ("-".equals(token)) {
                    stack.push(first - top);
                } else if ("*".equals(token)) {
                    stack.push(first * top);
                } else {
                    stack.push(first / top);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
