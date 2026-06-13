class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int result[] = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int t = temperatures[i];
            while(!stack.isEmpty() && t > stack.peek()[0]){
                result[stack.peek()[1]] = i - stack.peek()[1];
                stack.pop();
            }
            stack.push(new int[]{t,i});
        }
        return result;
    }
}
