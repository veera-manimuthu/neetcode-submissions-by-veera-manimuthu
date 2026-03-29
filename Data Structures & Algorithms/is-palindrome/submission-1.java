class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0, len = chars.length -1;
        while (i <= len) {
            while (i <= len && !isValidChar(chars[i])) {
                i++;
            }
            while (i <= len && !isValidChar(chars[len])) {
                len--;
            }
            if (i <= len && Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[len])) {
                return false;
            }
            i++;
            len--;
        }
        return true;
    }

    private boolean isValidChar(char c) {
       return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
