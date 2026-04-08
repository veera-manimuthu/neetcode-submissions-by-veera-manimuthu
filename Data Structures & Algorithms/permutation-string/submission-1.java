class Solution {
    public boolean checkInclusion(String s1, String s2) {
        String s1Str = Arrays.toString(getArr(s1));
        // System.out.println(s1Str);
        int l=0, r =l+s1.length();
        while (l < r && r <= s2.length()) {
            String subStr = Arrays.toString(getArr(s2.substring(l, r)));
            // System.out.println(subStr);
            if (s1Str.equals(subStr)) {
                return true;
            }
            l++;
            r = l+s1.length();
        }
        return false;
    }

    private int[] getArr(String s) {
        // System.out.println(s);
        int[] arr = new int[26];
        for (char c1 : s.toCharArray()) {
            arr[c1 -'a']++;
        }
        return arr;
    }
}
