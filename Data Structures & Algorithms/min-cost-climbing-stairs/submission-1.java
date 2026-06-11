class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if(len==1)
            return cost[0];
        if(len==2)
            return Math.min(cost[0],cost[1]);
        int secondLast = 0;
        int firstLast = Math.min(cost[0],cost[1]);
        int curr=firstLast;
        for(int i=2;i<len;i++){
            curr = Math.min(cost[i-1]+secondLast,cost[i]+firstLast);
            secondLast = firstLast;
            firstLast = curr;
        }
        return curr;
    }
}
