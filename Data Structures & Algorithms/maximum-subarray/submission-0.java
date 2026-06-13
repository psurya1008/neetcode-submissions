class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum = Math.max(0,currSum);
            currSum += nums[i];
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
