class Solution {
    public boolean isPalindrome(String s) {
    String filteredString = s.replaceAll("[^a-zA-Z0-9]", "");
    int i=0;
    int j=filteredString.length()-1;
    filteredString=filteredString.toLowerCase();
    while(i<j){
        if(filteredString.charAt(i)==filteredString.charAt(j)){
            i++;
            j--;
            continue;
        }
        else{
            return false;
        }
    }
    return true;
    }
}
