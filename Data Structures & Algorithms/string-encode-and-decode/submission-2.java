class Solution {

    public String encode(List<String> strs) {
        StringBuilder strBldr = new StringBuilder();
        int counter = 0;
        for (String str : strs) {
            counter++;
            strBldr.append(str.length());
            if (counter != strs.size()) {
                strBldr.append(",");
            }
        }
        strBldr.append("$");
        for (String str : strs) {
            strBldr.append(str);
        }
        return strBldr.toString();
    }

    public List<String> decode(String str) {
        List<String> answer = new ArrayList<>();
        if (str.length() > 0) {
            List<String> split = Arrays.asList(str.split("\\$"));
            if (split.size() > 0) {
                String lengthAsStr = split.get(0);
                String[] wordLengths = lengthAsStr.split(",");
                StringBuilder originalStr = new StringBuilder();
                for (int i=1; i < split.size(); i++) {
                    if (i != 1) {
                        originalStr.append("$");
                    }
                    originalStr.append(split.get(i));
                }
                int start = 0;          
                for (String wordLen : wordLengths) {
                    int end = Integer.parseInt(wordLen);
                    answer.add(originalStr.toString().substring(start, start+end));
                    start += end;
                }              
            }             
        }
        return answer;
    }
}
