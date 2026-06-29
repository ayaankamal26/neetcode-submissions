class Solution {
    public int buyChoco(int[] prices, int money) {
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < firstSmallest){
                secondSmallest = firstSmallest;
                firstSmallest = prices[i];
            }
            else if(prices[i] < secondSmallest){
                secondSmallest = prices[i];
            }
        }
        int price = firstSmallest + secondSmallest;
        if(price <= money){
            return money-price;
        }
        return money;
    }
}