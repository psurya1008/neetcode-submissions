class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap <Integer,Integer> hashm= new HashMap <>();
        for(int i=0;i<nums.length;i++){
            hashm.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(hashm.get(target-nums[i])!=null && hashm.get(target-nums[i])!=i){
                return new int[]{i,hashm.get(target-nums[i])};
            }
        }
        return new int[]{};
    }
}
