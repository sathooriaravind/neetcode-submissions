class Solution {
    public int majorityElement(int[] nums) {
        int majorityE = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(majorityE != nums[i]){
                count--;
                if(count==0){
                    majorityE = nums[i];
                    count=1;
                }
            }
            else
                count++;
        }
        return majorityE;
    }
}