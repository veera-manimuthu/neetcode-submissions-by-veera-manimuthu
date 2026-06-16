class Solution {
    public String encode(List<String> strs) {
        StringBuilder strBldr = new StringBuilder();
        int i = 0;
        for (String str : strs) {
            i++;
            strBldr.append(str.length());
            if (strs.size() == i) {
                strBldr.append("$");
            } else {
                strBldr.append(",");
            }
        }
        i = 0;
        for (String str : strs) {
            i++;
            strBldr.append(str);
            if (strs.size() != i) {
                strBldr.append("#");
            }
        }
        return strBldr.toString();
    }

    public List<String> decode(String str) { 
        List<String> decoded = new ArrayList<>();
        String[] strSplit = str.split("\\$");
        List<String> lengths = Arrays.asList(strSplit[0].split("\\,"));
        List<String> words = new ArrayList<>();
        if (strSplit.length > 1) {
            words = Arrays.asList(strSplit[1].split("\\#"));
        }
        int i = 0;
        for (String len : lengths) {
            int length = Integer.parseInt(len);
            if (length == 0) {
                decoded.add("");
            } else if (length == 1) {
                decoded.add("#");
            } else if (words.size() > i && words.get(i).length() == length) {
                decoded.add(words.get(i));
            }
            i++;
        }
        return decoded;
    }
}
