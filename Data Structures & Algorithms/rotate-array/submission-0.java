class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k = k%n;
        for(int i=0;i<n/2;i++){
            int temp = nums[n-i-1];
            nums[n-i-1] = nums[i];
            nums[i] = temp;
        }
        for(int i=0;i<k/2;i++){
            int temp = nums[k-i-1];
            nums[k-i-1] = nums[i];
            nums[i] = temp;
        }
        for(int i=k;i<(n+k)/2;i++){
            int temp = nums[n-1+k-i];
            nums[n+k-i-1] = nums[i];
            nums[i] = temp;
        }
    }
    
}