class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        Set<Character> chars = new HashSet<>();
        int l=0, r=0, len = s.length();
        while (r < len) {
            while (!chars.add(s.charAt(r))) {
                chars.remove(s.charAt(l));
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}
