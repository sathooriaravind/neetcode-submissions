class Solution {
    private void backtrack(int[] nums,int currIndex,List<Integer> list, 
    List<List<Integer>> res){
        int n = nums.length;
        if(currIndex==n){
            res.add(new ArrayList<>(list));
            return ;
        }
        backtrack(nums,currIndex+1,list,res);
        list.add(nums[currIndex]);
        backtrack(nums,currIndex+1,list,res);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),res);
        return res;
    }
}
