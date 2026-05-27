class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i=1; i < strs.length; i++) {
            int l = 0;
            while (l < Math.min(strs[i].length(), prefix.length())) {
                if (strs[i].charAt(l) != prefix.charAt(l)) {
                    break;
                }
                l++;
            }
            prefix = strs[i].substring(0, l);
        }
        return prefix;
    }
}