class Solution {
    public int maxProfit(int[] prices)
    {
        if(prices.length==1 || prices.length==0)
        {
            return 0;
        }
        
        int profit = 0;
        int flag = 0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++)
        {
            profit = Math.max(profit, prices[i] - min);
            min = Math.min(min,prices[i]);
        }
        if(profit < 0)
        {
            return 0;
        }
        else
        {
            return profit;
        }
       
    }
}
