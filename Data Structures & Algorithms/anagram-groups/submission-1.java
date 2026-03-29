class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> anagramsGroup = new ArrayList<>();
		if (strs.length <= 1) {
			anagramsGroup.add(Arrays.asList(strs));
			return anagramsGroup;
		}
		
		Set<Map<Character, Integer>> list = new HashSet<>();
		for (String str : strs) {
			Map<Character, Integer> charsWithCount = new HashMap<>();
			for (int idx = 0; idx < str.length(); idx++) {
				charsWithCount.compute(str.charAt(idx), (key, val) -> (val == null) ? 1 : val + 1);
			}
			list.add(charsWithCount);
		}

		if (strs.length == list.size()) {
			for (String s : strs) {
				List<String> res = new ArrayList<>();
				res.add(s);
				anagramsGroup.add(res);
			}
			return anagramsGroup;
		}
        
        for (Map<Character, Integer> map : list) {
			List<String> res = new ArrayList<>();
			for (String str : strs) {
				Map<Character, Integer> anotherMap = new HashMap<>();
				for (int idx=0; idx < str.length(); idx++) {
					anotherMap.compute(str.charAt(idx), (key, val)-> (val == null) ? 1 : val+1);
				}
				if (map.equals(anotherMap)) {
					res.add(str);
	            }
			}
			anagramsGroup.add(res);
         }

        return anagramsGroup;
    }
}
