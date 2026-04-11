class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Arr = new int[26];
        for (char ch1 : s1.toCharArray()) {
            s1Arr[ch1 - 'a']++;
        }
        String s1ArrStr = Arrays.toString(s1Arr);
        int l =0, r =0 ; 
        int[] s2Arr = new int[26];
        while (r < s2.length()) {
             while ( r-l < s1.length()) {
                s2Arr[s2.charAt(r) - 'a']++;
                r++;
             }
             if (s1ArrStr.equals(Arrays.toString(s2Arr))) {
                return true;
             } else {
                s2Arr[s2.charAt(l) - 'a']--;
                l++;
                if (s1ArrStr.equals(Arrays.toString(s2Arr))) {
                   return true;
                }
             }
        }
        return false;
    }
}
