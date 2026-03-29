class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length()-1;
        for (int i=0; i <= len; i++) {
            while (i <= len && !isValidChar(s.charAt(i))) {
                i++;
            }
            while (i <= len && !isValidChar(s.charAt(len))) {
                len--;
            }
            if (i <= len && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(len))) {
                return false;
            }
            len--;
        }
        return true;
    }

    private boolean isValidChar(char c) {
       return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
