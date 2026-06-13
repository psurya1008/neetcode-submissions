class Solution {
    public boolean canJump(int[] nums) {
        int lIndex = nums.length - 1;
        int reach =lIndex;
        for(int i=lIndex-1;i>=0;i--){
            if(nums[i]+i>=reach){
                reach=i;
            }
        }
        if(reach==0){
            return true;
        }
        else{
            return false;
        }
    }
}
