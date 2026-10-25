class Solution {
    private static final List<String> symbols = Arrays.asList("+", "-", "/", "*");

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (symbols.contains(token)) {
                int top = stack.pop();
                int bottom = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(bottom + top);
                        break;
                    case "-":
                        stack.push(bottom - top);
                        break;
                    case "*":
                        stack.push(bottom * top);
                        break;
                    case "/":
                        stack.push(bottom / top);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
