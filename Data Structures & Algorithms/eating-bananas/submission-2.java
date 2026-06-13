class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max_k= Arrays.stream(piles).max().getAsInt();
        int l=1;
        int r=max_k;
        int result = max_k;
        while(l<r){
            int mid = l+(r-l)/2;
            int sum=0;
            for(int i=0;i<piles.length;i++){
                sum+=(int)Math.ceil((double)piles[i]/mid);
            }
            if(sum>h){
                l=mid+1;
            }
            else{
                result = Math.min(result,mid);
                r=mid;
            }
        }
        return result;
    }
}
