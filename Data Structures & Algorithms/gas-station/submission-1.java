class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int tank = 0;
        int total = 0;
        int startIndex = 0;
        for(int i=0;i<n;i++){
            int diff = gas[i]-cost[i];
            tank += diff;
            total += diff;
            if(tank<0){
                startIndex=i+1;
                tank=0;
            }
        }
        return total >= 0 ? startIndex : -1;
    }
}
