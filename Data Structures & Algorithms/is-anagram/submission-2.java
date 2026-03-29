class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] anagramS = new int[26];
        for (int i=0; i<s.length(); i++) {
            anagramS[s.charAt(i)-'a']++;
        }
        int[] anagramT = new int[26];
        for (int i=0; i<t.length(); i++) {
            anagramT[t.charAt(i)-'a']++;
        }
        return Arrays.toString(anagramS).equals(Arrays.toString(anagramT));
    }
}
