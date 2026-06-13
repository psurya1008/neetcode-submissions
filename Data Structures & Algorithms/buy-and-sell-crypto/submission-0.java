class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=l+1;
        int max_profit=0;
        while(l<r&&r<prices.length){
            if(prices[l]>prices[r]){
                l=r;
                r+=1;
            }
            else if(prices[l]<prices[r]){
            max_profit=Math.max(max_profit,prices[r]-prices[l]);
            r++;
            }
            else{
                r++;
            }
        }
        return max_profit;
    }
}
