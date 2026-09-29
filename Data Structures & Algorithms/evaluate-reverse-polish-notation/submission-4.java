class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        List<String> symbols = Arrays.asList("+", "-", "*", "/");
        for (String token : tokens) {
            if (symbols.contains(token)) {
                int latest = stack.pop();
                int prev = stack.pop();
                if ("+".equals(token)) {
                    stack.push(prev + latest);
                } else if ("-".equals(token)) {
                    stack.push(prev - latest);
                } else if ("*".equals(token)) {
                    stack.push(prev * latest);
                } else if ("/".equals(token)) {
                    stack.push(prev / latest);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            return 0;
        }
    }
}
