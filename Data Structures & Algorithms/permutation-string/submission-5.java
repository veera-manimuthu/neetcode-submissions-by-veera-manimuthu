class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1Arr = new int[26];
        for (char ch : s1.toCharArray()) {
            s1Arr[ch - 'a']++;
        }
        String s1ArrAsStr = Arrays.toString(s1Arr);
        int l = 0, r = 0, n = s2.length();
        int[] s2Arr = new int[26];
        while (r < n) {
            s2Arr[s2.charAt(r) - 'a']++;
            if (r - l + 1 == s1.length()) {
                if (s1ArrAsStr.equals(Arrays.toString(s2Arr))) {
                    return true;
                } else {
                    char ch = s2.charAt(l);
                    s2Arr[ch - 'a']--;
                    l++;
                }
            }
            r++;
        }
        return false;
    }
}
