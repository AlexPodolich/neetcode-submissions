class Solution {
    public int maxProfit(int[] prices) {
        
        // int l = 0;

        // int res = 0;

        // for (int r = 1; r < prices.length; r++){
        //     while(prices[l] > prices[r]){
        //         l++;
        //     }
        //     res = Math.max(res, prices[r] - prices[l]);
        // }

        // return res;
        
        //using minPrice and maxProfit

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices){
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}
