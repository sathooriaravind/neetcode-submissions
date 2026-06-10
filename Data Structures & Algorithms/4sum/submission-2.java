class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-3;i++){
            while(i>0 && i<n-3 && nums[i]==nums[i-1])
                i++;
            for(int j=i+1;j<n-2;j++){
                while(j>i+1 && j<n-2 && nums[j]==nums[j-1])
                    j++;
                int low = j+1,high=n-1;
                while(low<high){
                    long sum = (long) nums[i] + nums[j] + nums[low] + nums[high];
                    if(sum==target){
                        res.add(List.of(nums[i],nums[j],nums[low],nums[high]));
                        low++;
                        high--;
                        while(low<high && nums[low]==nums[low-1])
                            low++;
                        while(low<high && nums[high]==nums[high+1])
                            high--;
                    }
                    else if(sum<target)
                        low++;
                    else
                        high--;
                }
            }
        }
        return res;
    }
}