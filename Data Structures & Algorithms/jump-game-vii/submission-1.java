class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        if(s.charAt(n-1)=='1')
            return false;
        boolean[] reachable = new boolean[n];
        reachable[0] = true;
        for(int i=minJump;i<=Math.min(maxJump,n-1);i++){
            if(s.charAt(i)=='0')
                reachable[i]=true;
        }
        for(int i=Math.min(maxJump,n-1)+1;i<n;i++){
            if(s.charAt(i)=='0'){
                boolean temp = false;
                int index = i-minJump;
                while(index>=Math.max(0,i-maxJump)){
                    temp = temp || reachable[index];
                    index--;
                }
                reachable[i] = temp;
            }
        }
        return reachable[n-1];
    }
}