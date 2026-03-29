class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            int[] charArr = new int[26];
            for (int i=0; i<str.length(); i++) {
                charArr[str.charAt(i) - 'a']++;
            }
            String key=Arrays.toString(charArr);
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(str);
            anagrams.put(key,  anagrams.get(key));            
        }
        return new ArrayList<>(anagrams.values());
    }
}
