//we're having two strings s and t
//if s and t are of the same length, and if not retun false
//intialize an integer array of length 26
//loop for the length of the strings and increment by one for every character in s
//decrement by 1 for every character in t
//Finally check if any integer is zero and return false if it is
//return true if none are

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int i : count){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
