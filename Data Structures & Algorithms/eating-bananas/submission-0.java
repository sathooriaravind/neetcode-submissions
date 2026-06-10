class Solution {
    public int timeTaken(int[] piles, int rate){
        int timeT = 0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]%rate!=0)
                timeT += piles[i]/rate + 1;
            else
                timeT += piles[i]/rate;
        }
        return timeT;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }
        int l=1,r=max;
        while(l<r){
            int m = l+(r-l)/2;
            if(timeTaken(piles,m)>h)
                l=m+1;
            else
                r = m;
        }
        return l;
    }
}
