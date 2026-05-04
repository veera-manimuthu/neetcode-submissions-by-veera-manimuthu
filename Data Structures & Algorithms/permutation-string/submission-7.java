class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Arr[s1.charAt(i) - 'a']++;
            s2Arr[s2.charAt(i) - 'a']++;
        }
        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1Arr[i] == s2Arr[i]) {
                matches++;
            }
        }
        for (int i = s1.length(); i < s2.length(); i++) {
            if (matches == 26) {
                return true;
            }
            int idx = s2.charAt(i) - 'a';
            s2Arr[idx]++;
            if (s1Arr[idx] == s2Arr[idx]) {
                matches++;
            } else if (s2Arr[idx] == s1Arr[idx] + 1) {
                matches--;
            }
            idx = s2.charAt(i - s1.length()) - 'a';
            s2Arr[idx]--;
            if (s1Arr[idx] == s2Arr[idx]) {
                matches++;
            } else if (s1Arr[idx] - 1 == s2Arr[idx]) {
                matches--;
            }
        }
        return matches == 26;
    }
}
