class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();
        int longestLen = 0;
        int len = s.length();
        if (len > 0) {
            char[] ch = s.toCharArray();
            for (int l=0; l < len; l++) {                
                chars.add(ch[l]);
                int r = l+1;
                while (r < len && chars.add(ch[r])) {
                    r++;
                }
                longestLen = Math.max(r-l, longestLen);
                chars = new HashSet<>();
            }
        }
        return longestLen;        
    }
}
