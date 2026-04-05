class Solution {
    public int characterReplacement(String s, int k) {
        int l =0, ans = 0, currCharOcc=0;
        int[] chars = new int[26];
        for (int r =0; r < s.length(); r++) {
            chars[s.charAt(r) - 'A']++;
            currCharOcc = Math.max(currCharOcc, chars[s.charAt(r) - 'A']);
            while ((r - l +1) - currCharOcc > k) {
                chars[s.charAt(l) - 'A']--;
                l++;
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}
