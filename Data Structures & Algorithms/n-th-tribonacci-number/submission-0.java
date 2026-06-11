class Solution {
    public int tribonacci(int n) {
        int thirdLast = 0, secondLast = 1, firstLast = 1;
        if(n==0)
            return 0;
        if(n<=2)
            return 1;
        int val = 1;
        for(int i=3;i<=n;i++){
            val = thirdLast + secondLast + firstLast;
            thirdLast = secondLast;
            secondLast = firstLast;
            firstLast = val;
        }
        return val;
    }
}