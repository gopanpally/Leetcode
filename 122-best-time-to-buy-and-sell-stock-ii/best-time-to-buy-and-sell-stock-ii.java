class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int n = prices.length;
        int maxProfit =0;
        for(int i =0; i<n;i++)
        {
            if(minPrice>prices[i])
            {
                minPrice = prices[i];
            }
           else 
           {
            int profit = prices[i]-minPrice;
            maxProfit += profit;
            minPrice = prices[i];
           }
           
        }
        return maxProfit;
    }
}