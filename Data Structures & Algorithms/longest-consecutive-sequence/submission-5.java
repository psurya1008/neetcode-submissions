class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        boolean sequenceCalc = false;
        int maxSequenceLength=1;
        for(int j=0;j<nums.length;j++){
            if(hm.containsKey(nums[j]-1)){
                continue;
            }
            if(hm.containsKey(nums[j]+1)){
                int i=1;
                while(hm.containsKey(nums[j]+i)){
                    i++;
                }
                maxSequenceLength = Math.max(maxSequenceLength,i);
            }
        }
        return maxSequenceLength;
    }
}
