class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int longestPrefix = strs[0].length();
        int[] arr = new int[longestPrefix];
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            for (int j = 0; j < longestPrefix; j++) {
                char ch = str.charAt(j);
                if (i == 0) {
                    arr[j] = ch - 'a';
                } else if (arr[j] != (ch - 'a')) {
                    longestPrefix = j;
                }
            }
        }
        return strs[0].substring(0, longestPrefix);
    }
}