class Solution {
    public int evalRPN(String[] tokens) {
        List<String> operators = Arrays.asList("+", "-", "*", "/");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (operators.contains(tokens[i])) {
                int second = stack.pop();
                int first = stack.pop();
                switch (tokens[i]) {
                    case "+":
                        stack.push(first + second);
                        break;
                    case "-":
                        stack.push(first - second);
                        break;
                    case "*":
                        stack.push(first * second);
                        break;
                    case "/":
                        stack.push(first / second);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
