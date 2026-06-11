class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int max = 0;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        int firstLast = Math.max(nums[0],nums[1]);
        max = firstLast;
        int secondLast = nums[0];
        for(int i=2;i<n-1;i++){
            max = Math.max(secondLast+nums[i],firstLast);
            secondLast = firstLast;
            firstLast = max;
        }
        int max1 = max;
        firstLast = Math.max(nums[1],nums[2]);
        secondLast = nums[1];
        max = firstLast;
        for(int i=3;i<n;i++){
            max = Math.max(secondLast+nums[i],firstLast);
            secondLast = firstLast;
            firstLast = max;
        }
        return Math.max(max1,max);
    }
}
