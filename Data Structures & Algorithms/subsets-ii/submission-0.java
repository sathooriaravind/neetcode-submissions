class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,nums,new ArrayList<>(),res);
        return res;
    }

    private void backtrack(int index, int[] nums,
            List<Integer> current,
            List<List<Integer>> result) {
        // Every state is a valid subset
        result.add(new ArrayList<>(current));


        for (int i = index; i < nums.length; i++) {
            if(i>index && nums[i]==nums[i-1])
                continue;
            current.add(nums[i]); // choose
            backtrack(i + 1, nums, current, result); // explore
            current.remove(current.size() - 1); // undo
        }
    }

}
