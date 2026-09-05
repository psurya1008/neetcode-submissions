class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int i=0;
        int j = heights.length - 1;
        while(i<j){
            maxWater = Math.max(maxWater, Math.min(heights[j],heights[i])*(j-i));
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;
    }
}
