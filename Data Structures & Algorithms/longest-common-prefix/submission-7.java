class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i=0; i < prefix.length(); i++) {
            for (String str : strs) {
                if (str.length() == i || prefix.charAt(i) != str.charAt(i)) {
                    return str.substring(0, i);
                }
            }
        }
        return prefix;
    }
}