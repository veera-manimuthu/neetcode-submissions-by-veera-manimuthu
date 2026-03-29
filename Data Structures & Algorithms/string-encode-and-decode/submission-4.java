class Solution {

    public String encode(List<String> strs) {
        StringBuilder strBldr = new StringBuilder();
        for (int i=0; i < strs.size(); i++) {
            strBldr.append(strs.get(i).length());
            if (i != strs.size()-1) {
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
        List<String> ans = new ArrayList<>();
        if (str != null && !"".equals(str)) {
            String[] firstSplit = str.split("\\$");
            if (firstSplit.length > 0) {
                String[] lengths = firstSplit[0].split(",");
                StringBuilder originalString = new StringBuilder();
                for (int i=1; i < firstSplit.length; i++) {
                    if (i != 1) {
                        originalString.append("$");
                    }
                    originalString.append(firstSplit[i]);                    
                }
                int start = 0;
                for (String length : lengths) {
                    int end = Integer.parseInt(length);
                    ans.add(originalString.substring(start, start+end));
                    start += end;
                }
            }
        }
        return ans;
    }
}
