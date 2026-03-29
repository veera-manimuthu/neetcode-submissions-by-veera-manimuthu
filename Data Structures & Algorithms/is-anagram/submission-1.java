class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> values = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			values.compute(s.charAt(i), (k, v) -> (v == null ? 1 : 1 + v));
		}
		for (int i = 0; i < t.length(); i++) {
			Character key = t.charAt(i);
			if (!values.containsKey(key)) {
				return false;
			} else {
				int va = values.get(key);
				if (va - 1 == 0) {
					values.remove(key);
				} else {
					values.put(key, va - 1);
				}
			}
		}
		return values.isEmpty();
    }
}
