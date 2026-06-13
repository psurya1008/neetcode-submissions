
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(ch == ')' && !stack.isEmpty()){
                if(stack.peek()=='('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch=='}' && !stack.isEmpty()){
                if(stack.peek()=='{'){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch ==']' && !stack.isEmpty()){
                if(stack.peek()=='['){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(ch);
            }
        }
        
        // If stack is empty, all brackets are matched
        return stack.isEmpty();
    }
}
