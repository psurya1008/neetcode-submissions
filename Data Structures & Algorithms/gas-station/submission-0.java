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
        while(i < gas.length){
            currentGas=0;
            int j=i;
            int len=0;
            while(true){
            currentGas+=gas[j];
            if(currentGas - cost[j]<0){
                i+=1;
                break;
            }
            len++;
            currentGas-=cost[j];
            if(len==gas.length){
                return i;
            }
            if(j==gas.length-1){
                j=0;
                continue;
            }
            j++; 
            }
        }
        return -1;
    }
}
