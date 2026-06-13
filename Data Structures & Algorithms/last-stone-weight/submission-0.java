class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

    for(int i:stones){
        pq.add(i);
    }
    int x,y;
    while(pq.size()>1){
        x=pq.poll();
        y=pq.poll();
        if((x-y)==0){
            continue;
        }
        pq.add(x-y);
    }
    if(pq.size()==0){
        return 0;
    }
    return pq.peek();
    }
}
