class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(candidates, target, curr, res, 0);
        return res;
    }

    public void backtrack(int[] candidates, int target, List<Integer> curr, List<List<Integer>> res, int i){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0 || i>=candidates.length){
            return;
        }
        for (int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1]) continue;

            if (candidates[j] > target) break; // no need to continue

        curr.add(candidates[j]);
        backtrack(candidates,target-candidates[j],curr,res,j+1);
        curr.remove(curr.size() - 1);
        }
    }
}
