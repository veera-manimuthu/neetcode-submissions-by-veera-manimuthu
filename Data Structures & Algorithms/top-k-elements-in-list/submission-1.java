class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> valAsKeyOccAsVal = new HashMap<>();
        for (int num : nums) {
            valAsKeyOccAsVal.put(num, valAsKeyOccAsVal.getOrDefault(num, 0)+1);            
        }
        System.out.println(valAsKeyOccAsVal);
        List<int[]> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> valueMap : valAsKeyOccAsVal.entrySet()) {
            int[] arr = new int[2];
            arr[0] = valueMap.getValue();
            arr[1] = valueMap.getKey();
            ans.add(arr);
        }

        ans.sort((a,b) -> b[0] - a[0] );

        int[] res = new int[k];
        for (int i=0; i<k; i++) {
            res[i] = ans.get(i)[1];
        }
        
        return res;
    }
}
