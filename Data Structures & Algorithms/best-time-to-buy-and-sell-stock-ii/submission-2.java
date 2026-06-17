class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else {
                totalProfit += (prices[i] - buy);
                buy = prices[i];
            }
        }
        return totalProfit;
    }
}