class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int l = 0;
            while (l < Math.min(prefix.length(), strs[i].length())) {
                if (prefix.charAt(l) != strs[i].charAt(l)) {
                    break;
                }
                l++;
            }
            prefix = prefix.substring(0, l);
        }
        return prefix;
    }
}