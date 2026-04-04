class Solution {
    public int characterReplacement(String s, int k) {
        int longest = 0, max = 0, l=0;
        int[] chars = new int[26];
        for (int r=0; r < s.length(); r++) {
            chars[s.charAt(r) - 'A']++;
            max = Math.max(max, chars[s.charAt(r)-'A']);
            while ((r-l+1-max) > k) {
                l++;
            }
            longest = Math.max(longest, r-l+1);
        }
        return longest;
    }
}
