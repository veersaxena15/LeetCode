class Solution {
    public static int maxProfit(int price[]) {
        int buyPrice=Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i< price.length; i++){
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyPrice = price[i];
            }
        }
        return maxprofit;
        
    }

    public static void main(){
        int prices[] = {7,6,4,3,1};
        int profit = maxProfit(prices);
        System.out.println("Max Profit is: "+ profit);
    }
}