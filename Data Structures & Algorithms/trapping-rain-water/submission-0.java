class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxL = new int[n];
        int[] maxR = new int[n];
        maxL[0]=0;
        for(int i=1;i<n;i++){
            maxL[i] = Math.max(height[i-1],maxL[i-1]);
        }
        maxR[n-1]=0;
        for(int i=n-2;i>=0;i--){
            maxR[i] = Math.max(height[i+1],maxR[i+1]);
        }
        int maxArea = 0;
        for(int i=0;i<n;i++){
            if(Math.min(maxL[i],maxR[i]) - height[i] > 0)
                maxArea += Math.min(maxL[i],maxR[i]) - height[i];
        }
        return maxArea;
    }
}
