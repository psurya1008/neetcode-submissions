class Solution {


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        subsetCalc(nums,res,li,0);
        return res;
    }

     private void subsetCalc(int[] nums,List<List<Integer>> res, List<Integer> li, int i) {
        if(i>=nums.length){
            res.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[i]);
        i+=1;
        subsetCalc(nums,res,li,i);
        li.remove(li.size()-1);
        subsetCalc(nums,res,li,i);
     }

}
 