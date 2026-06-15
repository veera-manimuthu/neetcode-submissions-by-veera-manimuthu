class Solution {
    public String encode(List<String> strs) {
        StringBuilder strBldr = new StringBuilder();
        for (String str : strs) {
            strBldr.append(str.length()).append('#').append(str);
        }
        return strBldr.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int wordLen = 0;
        List<String> split = Arrays.asList(str.split("\\#"));
        for (int i = 0; i < split.size(); i++) {
            if (i == 0) {
                wordLen = Integer.parseInt(split.get(i));
                if (wordLen == 0) {
                    decoded.add("");
                }
            } else {
                String currWord = split.get(i);
                String word = currWord.substring(0, wordLen);
                decoded.add(word);
                String nextNum = currWord.substring(word.length());
                if (!"".equals(nextNum)) {
                    wordLen = Integer.parseInt(nextNum);
                } else {
                    wordLen = 0;
                }
            }
        }
        return decoded;
    }
}
