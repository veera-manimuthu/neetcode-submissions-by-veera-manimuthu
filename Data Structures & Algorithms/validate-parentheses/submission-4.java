class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> brackets = Map.of('(', ')', '{', '}', '[', ']');
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (brackets.containsKey(ch)) {
                stack.push(ch);
            } else if (ch == brackets.get(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
