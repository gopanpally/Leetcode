class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = prices.length;

        for(int i=0;i<n;i++)
        {
            if(minPrice>prices[i])
            {
                minPrice = prices[i];
            }
            int profit = prices[i]-minPrice;
            if(maxProfit<profit)
            {
                maxProfit=profit;
            }
        }
       return maxProfit; 
    }
}