class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 0) {
            return 0;
        }
        int maxProfit = 0;
        int buy = prices[0];
        for (int price : prices) {
            if (buy > price) {
                buy = price;
            } else
                maxProfit = Math.max(maxProfit, price - buy);
        }
        return maxProfit;
    }
}
