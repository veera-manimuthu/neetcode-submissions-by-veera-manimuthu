class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqency = new HashMap<>();
        for (int num : nums) {
            freqency.put(num, freqency.getOrDefault(num, 0) + 1);
        }
        List<int[]> listArr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> map : freqency.entrySet()) {
            listArr.add(new int[] {map.getValue(), map.getKey()});
        }

        listArr.sort((a, b) -> b[0] - a[0]);
        int[] answer = new int[k];
        for (int i=0; i  <k; i++) {
            answer[i] = listArr.get(i)[1];
        }
        return answer;
    }
}
