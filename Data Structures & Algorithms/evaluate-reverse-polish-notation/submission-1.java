class Solution {
    public int evalRPN(String[] tokens) {
        List<String> operators = Arrays.asList("+", "-", "*", "/");
        Stack<String> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (operators.contains(tokens[i])) {
                int second = Integer.parseInt(stack.pop());
                int first = Integer.parseInt(stack.pop());
                switch (tokens[i]) {
                    case "+":
                        if (i + 1 == tokens.length) {
                            answer = first + second;
                        } else {
                            stack.push(String.valueOf(first + second));
                        }
                        break;
                    case "-":
                        if (i + 1 == tokens.length) {
                            answer = first - second;
                        } else {
                            stack.push(String.valueOf(first - second));
                        }
                        break;
                    case "*":
                        if (i + 1 == tokens.length) {
                            answer = first * second;
                        } else {
                            stack.push(String.valueOf(first * second));
                        }
                        break;
                    case "/":
                        if (i + 1 == tokens.length) {
                            answer = first / second;
                        } else {
                            stack.push(String.valueOf(first / second));
                        }
                        break;
                }
            } else {
                stack.push(tokens[i]);
            }
        }
        String rem = "";
        while (!stack.isEmpty()) {
            rem = rem + stack.pop();
        }
        if (!"".equals(rem)) {
            answer = Integer.valueOf(rem);
        }
        return answer;
    }
}
