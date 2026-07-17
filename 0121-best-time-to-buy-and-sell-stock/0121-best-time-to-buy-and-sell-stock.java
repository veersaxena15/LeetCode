class Solution {
    public static int maxProfit(int price[]) {
        int buyPrice=Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i< price.length; i++)
        {
            if(buyPrice < price[i])
            {
                int profit = price[i] - buyPrice;
                maxprofit = Math.max(maxprofit, profit);
            }
            else
            {
                buyPrice = price[i];
            }
        }
        return maxprofit;
    }
}