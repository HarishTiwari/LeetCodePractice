// Last updated: 5/27/2025, 12:47:01 AM
class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0, maxProfit=0 , minPrice = prices[0];
        
        for(int i = 0 ; i < prices.length ; i ++){
            
            profit = prices[i] - minPrice;
            
            minPrice = Math.min(minPrice , prices[i]);
            maxProfit = Math.max(profit,maxProfit);
        }
        
        return maxProfit;
        
    }
}