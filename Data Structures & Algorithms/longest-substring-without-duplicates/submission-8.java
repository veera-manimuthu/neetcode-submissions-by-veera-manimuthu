class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0, start =0;
        Map<Character, Integer> chars = new HashMap<>();
        for (int end=0; end<s.length(); end++) {
            if (chars.containsKey(s.charAt(end))) {
                start = chars.get(s.charAt(end))+1;
            }
            chars.put(s.charAt(end), end);
            answer = Math.max(answer, end-start+1);            
        }
        return answer;
    }
}
