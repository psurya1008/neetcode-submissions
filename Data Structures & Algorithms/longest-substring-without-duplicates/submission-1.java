class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=s.length();
        int max_len=0;
        int [] a=new int[128];
        int l=0;
        int r=0;
        while(l<length&&r<length){
            if(a[s.charAt(r)]==1){
                a[s.charAt(l)]=0;
                l++;
            }
            else{
            a[s.charAt(r)]=1;
            max_len=Math.max(max_len,r-l+1);
            r++;
            }
        }
        return max_len;
    }
}
