class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int []S1 = new int[26];
       int []S2 = new int[26];
       
        if (s1.length() > s2.length()) return false;
       int matches=0;

       for(int i=0;i<s1.length();i++){
        S1[s1.charAt(i)-'a']++;
        S2[s2.charAt(i)-'a']++;
       }

       if(Arrays.equals(S1,S2))
       return true;

        for (int i = s1.length(); i < s2.length(); i++) {
            S2[s2.charAt(i) - 'a']++; // add right character
            S2[s2.charAt(i - s1.length()) - 'a']--; // remove left character

            if (Arrays.equals(S1, S2)) return true;
        }
        return false;

    }
}
