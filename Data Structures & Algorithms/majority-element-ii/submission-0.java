class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int elem1 = 0, elem2 = 0, count1 = 0, count2 = 0;
        for (int num : nums) {
            if (count1 == 0) {
                count1++;
                elem1 = num;
            } else if (count2 == 0 && num != elem1) {
                count2++;
                elem2 = num;
            } else if (elem1 == num) {
                count1++;
            } else if (elem2 == num) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        List<Integer> answer = new ArrayList<>();
        int mustOcc = nums.length / 3;
        for (int num : nums) {
            if (elem1 == num) {
                count1++;
            } else if (elem2 == num) {
                count2++;
            }
        }
        if (count1 > mustOcc) {
            answer.add(elem1);
        }
        if (count2 > mustOcc) {
            answer.add(elem2);
        }
        return answer;
    }
}