class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            totalSum += nums[i];
            maxSum = Math.max(sum,maxSum);
            if(sum<0)
                sum=0;
        }
        if(maxSum<0)
            return maxSum;
        sum = 0;
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            minSum = Math.min(sum,minSum);
            if(sum>0)
                sum=0;
        }
        return Math.max(maxSum,totalSum - minSum);
    }
}