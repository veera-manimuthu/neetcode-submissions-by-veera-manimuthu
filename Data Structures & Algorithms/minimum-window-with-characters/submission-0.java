class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        int resLen = Integer.MAX_VALUE;
        int[] res = {-1, -1};
        for (int i=0; i<s.length(); i++)  {
            Map<Character, Integer> sMap = new HashMap<>();
            for (int j=i; j < s.length(); j++) {
                sMap.put(s.charAt(j), sMap.getOrDefault(s.charAt(j), 0)+1);
                boolean isMatch = true;
                for (char c : tMap.keySet()) {
                    if (sMap.getOrDefault(c, 0) < tMap.get(c)) {
                        isMatch = false;
                        break;
                    }
                }
                if (isMatch && resLen > (j-i+1)) {
                    resLen = j-i+1;
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]+1);
    }
}
