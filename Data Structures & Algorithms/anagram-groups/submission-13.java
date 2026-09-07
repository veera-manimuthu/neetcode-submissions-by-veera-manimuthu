class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroup = new HashMap<>();
        for (String str : strs) {
            int[] arr = new int[26];
            for (char ch : str.toCharArray()) {
                arr[ch - 'a']++;
            }
            String bldr = Arrays.toString(arr);
            anagramGroup.putIfAbsent(bldr, new ArrayList<>());
            anagramGroup.get(bldr).add(str);
        }
        return new ArrayList<>(anagramGroup.values());
    }
}
