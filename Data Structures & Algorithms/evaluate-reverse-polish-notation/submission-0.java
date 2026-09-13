class Solution {
    public int evalRPN(String[] token) {
        Stack<Integer> s = new Stack<>();
        int num1,num2;

        for(int i=0;i<token.length;i++){
            if(token[i].equals("+")||token[i].equals("-")||token[i].equals("/")||token[i].equals("*")){
                num1=s.pop();
                num2=s.pop();
                if(token[i].equals("+")){
                    s.push(num1+num2);
                }
                else if(token[i].equals("-")){
                     s.push(num2-num1);
                }
                else if(token[i].equals("/")){
                     s.push(num2/num1);
                }
                else if(token[i].equals("*")){
                    s.push(num1*num2);
                }
            }
            else{
                s.push(Integer.parseInt(token[i]));
            }
        }
        return s.pop();
    }
}
