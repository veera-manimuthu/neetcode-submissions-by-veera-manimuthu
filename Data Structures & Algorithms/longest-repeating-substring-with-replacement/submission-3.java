class Solution {
    public int characterReplacement(String s, int k) {
        // len - maxOcc > k --> 
        int answer = 0, l = 0, maxCharOcc=0;
        int[] arr = new int[26];
        for (int r=0; r < s.length(); r++) {
            arr[s.charAt(r) - 'A']++;
            maxCharOcc = Math.max(maxCharOcc,  arr[s.charAt(r) - 'A']);
            while ((r-l+1) - maxCharOcc > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            answer = Math.max(answer, r-l+1);
        }
        return answer;
    }
}
