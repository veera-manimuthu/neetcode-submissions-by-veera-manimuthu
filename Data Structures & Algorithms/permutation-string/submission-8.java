class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        for (int i=0; i < s1.length(); i++) {
            s1Arr[s1.charAt(i) - 'a']++;
            s2Arr[s2.charAt(i) - 'a']++;
        }
        int matches = 0;
        for (int i=0; i<26; i++) {
            if (s1Arr[i] == s2Arr[i]) {
                matches++;
            }
        }
        int end = s2.length();
        for (int i = s1.length(); i < end; i++) {
            if (matches == 26) {
                return true;
            }
            int rIdx = s2.charAt(i)-'a';
            s2Arr[rIdx]++;
            if (s1Arr[rIdx] == s2Arr[rIdx]) {
                matches++;
            } else if (s1Arr[rIdx]+1 == s2Arr[rIdx]){
                matches--;
            }

            int lIdx = s2.charAt(i-s1.length())-'a';
            s2Arr[lIdx]--;
            if (s1Arr[lIdx] == s2Arr[lIdx]) {
                matches++;
            } else if (s1Arr[lIdx]-1 == s2Arr[lIdx]) {
                matches--;
            }
        }

        return matches == 26;
    }
}
