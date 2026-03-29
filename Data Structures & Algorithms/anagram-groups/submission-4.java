class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsGroup = new HashMap<>();
        for (String str : strs) {
            int[] chars = new int[26];
            for (int i=0; i<str.length(); i++) {
                chars[str.charAt(i)-'a']++;
            }
            String strAsArr = Arrays.toString(chars);
            anagramsGroup.putIfAbsent(strAsArr, new ArrayList<>());
            anagramsGroup.get(strAsArr).add(str);
        }
        return new ArrayList<>(anagramsGroup.values());
    }
}
