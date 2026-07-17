class Solution {
    public static int maxProfit(int price[]) {
        int buyPrice=Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i< price.length; i++)
        {
           buyPrice = Math.min(buyPrice, price[i]);
           maxprofit = Math.max(maxprofit, price[i] - buyPrice);
        }
        return maxprofit;
    }
}