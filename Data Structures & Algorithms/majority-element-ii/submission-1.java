class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int elem1 = Integer.MIN_VALUE, elem2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;
        for (int num : nums) {
            if (count1 == 0 && elem2 != num) {
                elem1 = num;
                count1++;
            } else if (count2 == 0 && elem1 != num) {
                elem2 = num;
                count2++;
            } else if (elem1 == num) {
                count1++;
            } else if (elem2 == num) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        int occ = nums.length / 3;
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == elem1) {
                count1++;
            } else if (nums[i] == elem2) {
                count2++;
            }
        }
        List<Integer> answer = new ArrayList<>();
        if (count1 > occ) {
            answer.add(elem1);
        }
        if (count2 > occ) {
            answer.add(elem2);
        }
        return answer;
    }
}