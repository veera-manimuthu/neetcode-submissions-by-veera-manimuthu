class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsGroup = new HashMap<>();
        for (String str : strs) {
            int[] alphaIdx = new int[26];
            for (char c : str.toCharArray()) {
                alphaIdx[c - 'a']++;
            }
            String alphaIdxAsStr = Arrays.toString(alphaIdx);
            anagramsGroup.putIfAbsent(alphaIdxAsStr, new ArrayList<>());
            anagramsGroup.get(alphaIdxAsStr).add(str);
        }
        return new ArrayList<>(anagramsGroup.values());
    }
}
