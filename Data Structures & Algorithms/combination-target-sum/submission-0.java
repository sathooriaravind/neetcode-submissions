class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backTrack(0,0,nums,res,new ArrayList<>(),target);
        return res;
    }
    public void backTrack(int currIndex,int sum, int[] nums,List<List<Integer>> result,
    List<Integer> current,int target){
        if(sum==target){
            result.add(new ArrayList<>(current));
            return ;
        }
        if(sum > target){
            return ;
        }
        for(int i=currIndex;i<nums.length;i++){
            current.add(nums[i]);
            sum += nums[i];
            backTrack(i,sum,nums,result,current,target);
            current.remove(current.size()-1);
            sum -= nums[i];
        }
    }

}
