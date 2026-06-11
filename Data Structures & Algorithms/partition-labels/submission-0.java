class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] pos = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            pos[s.charAt(i)-'a']=i;
        }
        int maxReachable = 0, prevEnd = 0;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            maxReachable = Math.max(maxReachable,pos[s.charAt(i)-'a']);
            if(maxReachable==i){
                res.add(i-prevEnd+1);
                prevEnd = maxReachable + 1;
            }
        }
        return res;
    }
}
