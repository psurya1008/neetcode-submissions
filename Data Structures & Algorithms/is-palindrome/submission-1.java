class Solution {
    public boolean isPalindrome(String s) {
        int a=0;
          s = s.replaceAll("[^A-Za-z0-9]", "");
          s=s.toLowerCase();
        int b =s.length()-1;
        while(a<b){
            if(s.charAt(a) == s.charAt(b)){
                a++;
                b--;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
