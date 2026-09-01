//First create a prefix product array
//Create a suffix product array
//multiply the ith elements of both arrays to form a new array

// 1 1 2 8
// 1 6 24 48
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] res = new int[nums.length];

        prefix[0] = 1;
        suffix[0] = 1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i-1]*prefix[i-1];
            suffix[i]=nums[nums.length-i]*suffix[i-1];
        }
        for(int j=0;j<nums.length;j++){
            res[j] = prefix[j]*suffix[nums.length-j-1];
        }
        return res;
        
    }
}  
