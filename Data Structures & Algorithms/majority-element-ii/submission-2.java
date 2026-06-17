class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int elem1 = Integer.MIN_VALUE, elem2 = Integer.MIN_VALUE, cnt1 = 0, cnt2 = 0;
        for (int num : nums) {
            if (elem1 == Integer.MIN_VALUE || (elem1 == num && elem2 != num)) {
                elem1 = num;
                cnt1++;
            } else if (elem2 == Integer.MIN_VALUE || (elem2 == num && elem1 != num)) {
                elem2 = num;
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for (int num : nums) {
            if (elem1 == num) {
                cnt1++;
            } else if (elem2 == num) {
                cnt2++;
            }
        }
        List<Integer> majority = new ArrayList<>();
        if (cnt1 > nums.length / 3) {
            majority.add(elem1);
        }
        if (cnt2 > nums.length / 3) {
            majority.add(elem2);
        }
        return majority;
    }
}
