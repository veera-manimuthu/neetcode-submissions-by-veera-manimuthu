class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == t.length()) {
            return s.equals(t);
        } else if (s.length() > t.length()) {
            return false;
        } else {
            int sLen = s.length(), tLen = t.length();
            int l = 0;
            for (int r = 0; r < tLen; r++) {
                if (s.charAt(l) == t.charAt(r)) {
                    l++;
                }
                if (l == s.length()) {
                    return true;
                }
            }
            return false;
        }
    }
}