class Solution {
    public boolean isValid(String s) {
        char[] arr = new char[s.length()];
        int idx = -1;
        for (char ch : s.toCharArray()) {
            if (idx == -1 && isCloseParanthese(ch)) {
                return false;
            } else if (isOpenParanthese(ch)) {
                idx++;
                arr[idx] = ch;
            } else if (idx > -1 && isCloseParanthese(ch)) {
                if (ch == ']' && arr[idx] == '[') {
                    idx--;
                } else if (ch == ')' && arr[idx] == '(') {
                    idx--;
                } else if (ch == '}' && arr[idx] == '{') {
                    idx--;
                } else {
                    return false;
                }
            }
        }
        return idx == -1;
    }

    private static boolean isCloseParanthese(char ch) {
        return ch == ')' || ch == '}' || ch == ']';
    }

    private static boolean isOpenParanthese(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }
}
