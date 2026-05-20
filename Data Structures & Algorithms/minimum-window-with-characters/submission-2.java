class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray())
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        Map<Character, Integer> window = new HashMap<>();
        int resLen = Integer.MAX_VALUE, l = 0;
        int have = 0, need = tMap.size();
        int[] res = {-1, -1};
        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            window.put(ch, window.getOrDefault(ch, 0) + 1);
            if (tMap.containsKey(ch) && tMap.get(ch) == window.get(ch))
                have++;
            while(have == need) {
                if (resLen > (r-l+1)) {
                    resLen = r-l+1;
                    res[0] = l; res[1] = r;
                }
                char lChar = s.charAt(l);
                window.put(lChar, window.get(lChar)-1);
                if (tMap.containsKey(lChar) && window.get(lChar) < tMap.get(lChar)) {
                    have--;
                }
                l++;
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
