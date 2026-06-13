class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max_k= Arrays.stream(piles).max().getAsInt();
        int min_k=1;
        int res=max_k;
        int sum=0;
        while(min_k<=max_k){
            sum=0;
            int mid_k=min_k+(max_k-min_k)/2;
            for(int p : piles){
                sum+=Math.ceil((double)p/mid_k);
            }
            if(sum>h){
                min_k=mid_k+1;
            }
            else{
                res=mid_k;
                max_k=mid_k-1;
            }
        }
        return res;
    }
}
