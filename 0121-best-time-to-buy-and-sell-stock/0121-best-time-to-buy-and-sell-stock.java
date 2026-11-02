class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxpr = 0;
        for(int price:prices){
            if(price<minprice)
            minprice = price;
        
        if(price-minprice >maxpr)
        maxpr = price-minprice; }
        return maxpr;
        
    }
}