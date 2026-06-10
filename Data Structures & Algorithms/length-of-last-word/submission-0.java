class Solution {
    public int lengthOfLastWord(String s) {
        List<String> words = Arrays.asList(s.split(" "));
        return words.get(words.size() - 1).length();
    }
}