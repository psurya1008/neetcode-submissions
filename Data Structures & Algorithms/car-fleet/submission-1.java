class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        PriorityQueue<float[]> pq = new PriorityQueue<>( (a, b) -> Float.compare(b[0], a[0]));
        Stack <Float> stack = new Stack<>();
        float time;
        for(int i=0;i<position.length;i++){
            time = (float)(target - position[i]) / speed[i];
            pq.add(new float[]{(float)position[i],time});
        }
        int count=0;
        for(int i=0;i<position.length;i++){
            if(stack.isEmpty()){
                stack.push(pq.poll()[1]);
                count+=1;
                continue;
            }
            if(pq.peek()[1]<=stack.peek()){
                pq.poll();
                continue;
            }
            else{
                stack.push(pq.poll()[1]);
                count+=1;
            }
        }
        return count;

    }
}
