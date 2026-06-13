class Solution {

    static String getAnagram(String str){
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];

        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            sb.append(freq[i]);
            sb.append("$");
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>(); 
        
        for(int i=0;i<strs.length;i++){
            String Key=getAnagram(strs[i]);

            if(!mp.containsKey(Key)){
                mp.put(Key,res.size());
                res.add(new ArrayList<>());
            }
            res.get(mp.get(Key)).add(strs[i]);
        }
        return res;
           }
}
