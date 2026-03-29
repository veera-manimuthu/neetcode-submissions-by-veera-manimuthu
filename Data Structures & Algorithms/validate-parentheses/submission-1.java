class Solution {
    public boolean isValid(String s) {
        char[] arr = new char[s.length()];
        int top = -1;
        for (char c : s.toCharArray()) {
            if (top < 0 && (c == ']' || c == '}' || c == ')')) {
                return false;
            } else if (c == '[' || c == '{' || c == '(') {
                arr[++top] = c;
            } else if ((c==')' && arr[top] == '(') ||(c==']' && arr[top] == '[')
                ||(c=='}' && arr[top] == '{')) {
                top--;
            } else {
                return false;
            }
        }
        return top == -1;
    }
}
