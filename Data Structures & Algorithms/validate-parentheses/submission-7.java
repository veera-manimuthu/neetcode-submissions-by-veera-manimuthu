class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = Map.of('(', ')', '[', ']', '{', '}');
        for (char ch : s.toCharArray()) {
            if (map.keySet().contains(ch)) {
                stack.push(ch);
            } else if (!stack.isEmpty() && ch == map.get(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
