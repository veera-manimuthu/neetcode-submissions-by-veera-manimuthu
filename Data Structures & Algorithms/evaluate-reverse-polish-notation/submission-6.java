class Solution {
    public int evalRPN(String[] tokens) {
        List<String> operators = Arrays.asList("+", "-", "/", "*");
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (operators.contains(token)) {
                int top = stack.pop();
                int bottom = stack.pop();
                switch (token) {
                    case "*":
                        stack.push(top * bottom);
                        break;
                    case "+":
                        stack.push(top + bottom);
                        break;
                    case "-":
                        stack.push(bottom - top);
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
