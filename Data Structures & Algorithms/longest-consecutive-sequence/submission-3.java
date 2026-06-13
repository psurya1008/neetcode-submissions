class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hm.add(nums[i]);
        }
        if(nums.length==0){
            return 0;
        }
        int max_count=1;
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(hm.contains(nums[i]-1)){
                continue;
            }
            if(hm.contains(nums[i]+1)){
                count+=1;
                while(hm.contains(nums[i]+count+1)){
                    count+=1;
                }
                max_count=Math.max(count+1,max_count);
            }
        }
        return max_count;
    }
}
