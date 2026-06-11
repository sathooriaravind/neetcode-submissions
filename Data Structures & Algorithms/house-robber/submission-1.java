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
        int secondLast = nums[0];
        for(int i=2;i<n;i++){
            max = Math.max(secondLast+nums[i],firstLast);
            secondLast = firstLast;
            firstLast = max;
        }
        return max;
    }
}
