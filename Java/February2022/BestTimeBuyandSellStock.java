/*
1/2/2022: 121. Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/
class BestTimeBuyandSellStock {
    public int maxProfit(int[] prices) {
       int max_profit = 0;
        int min_price = Integer.MAX_VALUE;
        
        for(int price : prices){
            if(price < min_price)
                min_price = price;
            
            max_profit = Math.max(max_profit,price - min_price);
        }
        
        return max_profit;
    }
}
