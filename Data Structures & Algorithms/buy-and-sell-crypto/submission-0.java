class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; // initialize variable for max profit

        for(int i = 0; i < prices.length; i++){ // first loop to iterate through prices
            int buy = prices[i]; // init variable when we buy stocks
            for (int j = i + 1; j < prices.length; j++){ // second loop to iterate through prices after the day we bought it
                int sell = prices[j]; // init variable for day when we sell stocks
                maxProfit = Math.max(maxProfit, sell - buy); // update maxProfit variable by comparing the previous max profit value to the difference between sell and buy day 
            }
        }

        return maxProfit;
    }
}
