class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveChange = 0;
        int tenChange = 0;
        for(int i=0;i<bills.length;i++){
            int changeNeeded = bills[i] - 5;
            if(bills[i]==5){
                fiveChange++;
            }
            else if(bills[i]==10){
                tenChange++;
            }
            if(changeNeeded > 10 && tenChange > 0){
                tenChange--;
                changeNeeded -= 10;
            }
            while(changeNeeded > 0 && fiveChange > 0){
                changeNeeded -= 5;
                fiveChange--;
            }
            if(changeNeeded > 0)
                return false;
        }
        return true;
    }
}