class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int i=0;
        int j = heights.length - 1;
        while(i<j){
            int area = Math.min(heights[j],heights[i])*(j-i);
            maxWater = Math.max(maxWater,area);
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
