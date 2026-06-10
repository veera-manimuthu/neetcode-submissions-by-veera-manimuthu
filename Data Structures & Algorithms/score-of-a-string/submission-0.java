class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        int i=1;
        while (i < s.length()) {
            score += Math.abs(s.charAt(i-1) - s.charAt(i));
            i++;
        }
        return score;
    }
}