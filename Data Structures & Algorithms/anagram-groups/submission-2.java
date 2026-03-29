class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String s : strs) {
            int[] charArr = new int[26];
            for (char ch : s.toCharArray()) {
                charArr[ch -'a']++;
            }
            String key = Arrays.toString(charArr);
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }
}
