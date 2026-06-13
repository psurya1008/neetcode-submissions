class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumC=0;
        int sumG=0;
        for(int i=0;i<gas.length;i++){
            sumC+=cost[i];
            sumG+=gas[i];
        }
        if(sumC > sumG){
            return -1;
        }
        int currentGas=0;
        int i=0;
        int total=0;
        int index=0;
        while(i < gas.length){
            total+=(gas[i]-cost[i]);
            if(total<0){
                total=0;
                index=i+1;
            }
            i++;
        }
        return index;
    }
}
