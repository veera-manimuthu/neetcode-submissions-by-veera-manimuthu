class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        Map<Character, Integer> charAsKeyIdxAsVal = new HashMap<>();
        int l=0, r=0, len = s.length();
        while (r < len) {
            if (charAsKeyIdxAsVal.containsKey(s.charAt(r))) {
                l = Math.max(charAsKeyIdxAsVal.get(s.charAt(r)) + 1, l); 
            }
            charAsKeyIdxAsVal.put(s.charAt(r), r);
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}
