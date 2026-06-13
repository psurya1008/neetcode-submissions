class Solution {
    public int maxProfit(int[] prices) {
          int maxPrice=0;
          int i=0;
          int j=i+1;
          while(i<j&&j<prices.length){
            if(prices[i]>=prices[j]){
                i=j;
                j++;
                continue;
            }
            else{
                maxPrice=Math.max(prices[j]-prices[i],maxPrice);
                j++;
            }
          }
          return maxPrice;
    }
}
