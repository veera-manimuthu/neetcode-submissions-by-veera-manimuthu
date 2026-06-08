class Solution {
    public boolean isSubsequence(String s, String t) {
        int l = 0;
        for (int r = 0; l < s.length() && r < t.length(); r++) {
            if (s.charAt(l) == t.charAt(r)) {
                l++;
            }
        }
        return l == s.length();
    }
}