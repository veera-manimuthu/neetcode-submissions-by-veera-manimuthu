class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int longestPrefix = strs[0].length();
        int[] arr = new int[longestPrefix];
        outer: for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            inner: for (int j = 0; j < longestPrefix; j++) {
                char ch = str.charAt(j);
                if (i == 0) {
                    arr[j] = ch - 'a';
                } else if (arr[j] != (ch - 'a')) {
                    longestPrefix = j;
                    continue outer;
                }
            }
        }
        return strs[0].substring(0, longestPrefix);
    }
}