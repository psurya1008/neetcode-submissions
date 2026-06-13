class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int max_water=0;
        while(l<r){
            int min_height=Math.min(heights[l],heights[r]);
            max_water=Math.max(max_water,min_height*(r-l));

            if(min_height==heights[l]){
                l++;
            }
            else{
                r--;
            }
        }
        return max_water;
    }
}
