class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>k){
                s.remove(nums[i-k-1]);
            }
            if(s.contains(nums[i]))
                return true;
            s.add(nums[i]);
        }
        return false;
    }
}