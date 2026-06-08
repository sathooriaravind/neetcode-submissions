class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(!s.contains(n)){
            s.add(n);
            int temp = n;
            n = 0;
            while(temp > 0){
                int rem = temp%10 ;
                n += rem * rem ;
                temp = temp/10;
            }
        }
        if(n==1)
            return true;
        return false;
    }
}
