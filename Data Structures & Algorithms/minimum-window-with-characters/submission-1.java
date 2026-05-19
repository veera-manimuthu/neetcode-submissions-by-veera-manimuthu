class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        int have = 0, need = tMap.size();
        int resLen = Integer.MAX_VALUE;
        int l = 0;
        int[] res = {-1, -1};
        for (int r=0; r<s.length(); r++)  {
           char c = s.charAt(r);
           window.put(c, window.getOrDefault(c, 0) + 1);
           if (tMap.containsKey(c) && tMap.get(c).equals(window.get(c))) {
                have++;
           }
           while (have == need) {
            if (resLen > (r-l+1)) {
                resLen = (r-l+1);
                res[0]=l;
                res[1]=r;
            }
            char left = s.charAt(l);
            window.put(left, window.get(left)-1);
            if (tMap.containsKey(left) && window.get(left) < tMap.get(left)) {
                have--;
            }
            l++;
           }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]+1);
    }
}
