class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of('(', ')', '{', '}', '[', ']');
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (map.keySet().contains(ch)) {
                stack.push(ch);
            } else if (!stack.isEmpty() && map.get(stack.peek()) == ch) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
