class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hashm= new HashMap<>();
        HashMap<Character,Integer> hashmm= new HashMap<>();
        for(int i=0;i<s.length();i++){
            hashm.put(s.charAt(i),hashm.getOrDefault(s.charAt(i),0)+1);
            hashmm.put(t.charAt(i),hashmm.getOrDefault(t.charAt(i),0)+1);
        }
    for(int i=0;i<s.length();i++){
            if (!hashm.get(s.charAt(i)).equals(hashmm.getOrDefault(s.charAt(i), 0))) {
                return false;
            }
        }
    return true;
    }
}
