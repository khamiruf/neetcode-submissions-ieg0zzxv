class Solution {
    public int maxProfit(int[] prices) {
        int l = 0; 
        int r = l +1;
        int maxProfit = 0;

        while (r < prices.length && l < r) {
            int profit = prices[r] - prices[l];

            if (profit < 0) {
                l = r;
                r = l + 1;
            } else {
                maxProfit = Math.max(maxProfit, profit);
                r += 1;
            }
        }

        return maxProfit;
    }
}
