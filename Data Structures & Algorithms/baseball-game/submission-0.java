class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String opn : operations) {
            if ("+".equals(opn)) {
                stack.push(stack.get(stack.size() - 1) + stack.get(stack.size() - 2));
            } else if ("D".equals(opn)) {
                stack.push(2 * stack.get(stack.size() - 1));
            } else if ("C".equals(opn)) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(opn));
            }
        }
        int points = 0;
        while (stack.size() > 0) {
            points += stack.pop();
        }
        return points;
    }
}