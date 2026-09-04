
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int start=0;start<nums.length-1;start++){
            if(nums[start]>0) break;
            if(start > 0 && nums[start] == nums[start-1]) continue;
            int l = start+1;
            int r = nums.length -1;
            while(l<r){
                int sum = nums[l] + nums[r] + nums[start];
                if(sum == 0){
                    res.add(Arrays.asList(nums[start], nums[l], nums[r]));
                    l++;
                    r--;
                                        while (l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
                else if(sum < 0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return res;
    }
}
