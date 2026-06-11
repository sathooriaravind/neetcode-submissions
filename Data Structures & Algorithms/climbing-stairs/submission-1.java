class Solution {
    public int climbStairs(int n) {
        if(n<3)
            return n;
        int secondLast = 1, firstLast = 2, curr=0;
        for(int i=2;i<n;i++){
            curr = secondLast + firstLast;
            secondLast = firstLast;
            firstLast = curr;
        }
        return curr;
    }
}
