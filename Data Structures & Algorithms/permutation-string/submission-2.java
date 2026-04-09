class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> s1Map = new HashMap<>();
        for (char ch1 : s1.toCharArray()) {
          s1Map.put(ch1, s1Map.getOrDefault(ch1, 0) + 1);
        }       
        int l =0 ;
        Map<Character, Integer> s2Map = new HashMap<>();
        for (int r=0; r < s2.length();) {
            while (r < l+s1.length() && r < s2.length()) {
                char ch2 = s2.charAt(r);
                s2Map.put(ch2, s2Map.getOrDefault(ch2, 0) + 1);
                r++;
            }
            if (s1Map.equals(s2Map)) {
                return true;
            } else {
                char lCh = s2.charAt(l);
                if (s2Map.get(lCh) > 1) {
                    s2Map.put(lCh, s2Map.get(lCh)-1);
                } else {
                    s2Map.remove(lCh);
                }
                l++;
            }
        }
        return false;
    }
}
