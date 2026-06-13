class Solution {
    public boolean checkValidString(String s) {
        int minCount = 0;
        int maxCount = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                minCount++;
                maxCount++;
            }
            else if(s.charAt(i)==')'){
                minCount--;
                maxCount--;
            }
            else{
                minCount--;
                maxCount++;
            }
            if(maxCount<0){
                return false;
            }
            minCount =Math.max(0,minCount);
        }
        return minCount==0;
    }

}
