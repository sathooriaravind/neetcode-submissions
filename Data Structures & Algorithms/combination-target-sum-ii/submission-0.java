class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backTrack(0,0,candidates,res,new ArrayList<>(),target);
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
            if(i>currIndex && nums[i]==nums[i-1])
                continue;
            current.add(nums[i]);
            backTrack(i+1,sum+nums[i],nums,result,current,target);
            current.remove(current.size()-1);
        }
    }

}
