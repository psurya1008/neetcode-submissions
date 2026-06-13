class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;

        while(i<j){
            if(numbers[i]+numbers[j]==target){
                int [] arr=new int[]{i+1,j+1};
                return arr;
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        int [] arr=new int[0];
        return arr;
    }
}
