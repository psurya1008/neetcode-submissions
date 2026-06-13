class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<hand.length;i++){
            hm.put(hand[i],hm.getOrDefault(hand[i],0)+1);
        }
        Arrays.sort(hand);
        int j=0;
        int group =0;
        int count=0;
        while(count<hand.length){
            while(j<hand.length){
                if(hm.getOrDefault(hand[j],0)>0){
                    break;
                }
                else{
                    j++;
                }
            }
            if(j>=hand.length){
                break;
            }
            int start = hand[j];
            for(int i=0;i<groupSize;i++){
                if(hm.getOrDefault(start+i,0)==0){
                    return false;
                }
                else{
                    hm.put(start+i,hm.get(start+i)-1);
                }
            }
            count+=groupSize;
        }
        return true;
    }
}
