class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();
        int longestLen = 0;
        int len = s.length(), l =0,r=0;
        while (r < len) {
            while (!chars.add(s.charAt(r))) {
                chars.remove(s.charAt(l));
                l++;
            }
            longestLen = Math.max(r-l+1, longestLen);
            r++;
        }
        return longestLen;
    }
}
