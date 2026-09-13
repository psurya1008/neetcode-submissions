class Solution {
    public boolean isValid(String s) {
        Stack<Character> sta = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch ==')'&& !sta.isEmpty()){
                if(sta.peek()=='('){
                    sta.pop();
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(ch == '}' && !sta.isEmpty()){
                if(sta.peek()=='{'){
                    sta.pop();
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(ch == ']' && !sta.isEmpty()){
                if(sta.peek()=='['){
                    sta.pop();
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                sta.push(ch);
            }
        }
        if(!sta.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
}
