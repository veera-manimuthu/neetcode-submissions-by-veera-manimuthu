// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> answer = new ArrayList<>();
        int pairSize = pairs.size();
        for (int i = 0; i < pairSize; i++) {
            int j = i - 1;
            while (j >= 0 && j < pairSize && pairs.get(j).key > pairs.get(j + 1).key) {
                Pair temp = pairs.get(j + 1);
                pairs.set(j + 1, pairs.get(j));
                pairs.set(j, temp);
                j--;
            }
            answer.add(new ArrayList<>(pairs));
        }
        return answer;
    }
}
