class Solution {
    public int maxProfit(int[] prices) {
        // [7,6,4,3,1]
        int minPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int price : prices){
            if(price<minPrice){
                minPrice = price;
            }
            if(price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}