class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq =new PriorityQueue<>((a, b) -> Double.compare(distance(b), distance(a)));

        for(int[]i:points){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] result = pq.stream().toArray(int[][]::new);

        return result;

    }
    public double distance(int[] arr){
            return Math.sqrt(Math.pow(arr[0],2)+Math.pow(arr[1],2));
        }
}
