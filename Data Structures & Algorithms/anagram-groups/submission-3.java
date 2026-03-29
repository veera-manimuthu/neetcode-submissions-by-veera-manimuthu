class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsGroup = new HashMap<>();
        for (String str : strs) {
            int[] chars = new int[26];
            for (int i=0; i<str.length(); i++) {
                chars[str.charAt(i)-'a']++;
            }
            String strAsArr = Arrays.toString(chars);
            if (anagramsGroup.containsKey(strAsArr)) {
                anagramsGroup.get(strAsArr).add(str);
            } else {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(str);
                anagramsGroup.put(strAsArr, anagrams);
            }
        }
        List<List<String>> answer = new ArrayList<>();
        for (List<String> value : anagramsGroup.values()) {
            answer.add(value);
        }
        return answer;
    }
}
