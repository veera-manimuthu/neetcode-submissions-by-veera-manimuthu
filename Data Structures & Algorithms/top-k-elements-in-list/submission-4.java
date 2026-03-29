class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numFrquencyMap = new HashMap<>();
        for (int num : nums) {
            numFrquencyMap.put(num, numFrquencyMap.getOrDefault(num, 0)+1);
        }
        if (k == numFrquencyMap.size()) {
            int[] ans = new int[k];
            int i=0;
            for (int key : numFrquencyMap.keySet()) {
                ans[i++] = key;
            }
            return ans;
        }
        Map<Integer, List<Integer>> valueMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : numFrquencyMap.entrySet()) {
            valueMap.putIfAbsent(entry.getValue(), new ArrayList<>());
         List<Integer> v =   valueMap.get(entry.getValue());
            v.add(entry.getKey());
            valueMap.put(entry.getValue(), v);
        }
        List<Integer> freq = new ArrayList<>(valueMap.keySet());
        freq.sort((a,b)-> a - b);
        int[] answer = new int[k];
        //System.out.println(freq);
        int j=0;
        for (int i=freq.size()-1; i>=0; i--) {
          List<Integer> keys = valueMap.get(freq.get(i) );
          for (int l=0; l<keys.size() && j < k; l++) {
            answer[j++] =  keys.get(l);
          }
        }
        return answer;

    }
}
