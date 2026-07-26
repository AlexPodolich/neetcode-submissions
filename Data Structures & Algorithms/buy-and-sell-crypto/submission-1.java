class Solution {
    public int maxProfit(int[] prices) {
        // Sliding window solution
        // int maxProfit = 0; // initialize variable for max profit

        // for(int i = 0; i < prices.length; i++){ // first loop to iterate through prices
        //     int buy = prices[i]; // init variable when we buy stocks
        //     for (int j = i + 1; j < prices.length; j++){ // second loop to iterate through prices after the day we bought it
        //         int sell = prices[j]; // init variable for day when we sell stocks
        //         maxProfit = Math.max(maxProfit, sell - buy); // update maxProfit variable by comparing the previous max profit value to the difference between sell and buy day 
        //     }
        // }

        // return maxProfit;

        // Two pointers solution

        int l = 0, r = 1; // initialize left and right pointers with indexes 0 and 1

        int maxProfit = 0; // init max profit (0 by default)

        while(r < prices.length){ // enter loop while right pointer is less then size of the array
            if(prices[l] < prices[r]){ // when value of left pointer < value of right pointer
                int profit = prices[r] - prices[l]; // init current profit value of elem under pointer r - value under pointer left
                maxProfit = Math.max(maxProfit, profit); // update max profit
            }else{
                l = r; // we update left pointer to the value of right pointer
            }
            r++; // and increase right pointer by one
        }
        return maxProfit; // return max profit
    }
}
