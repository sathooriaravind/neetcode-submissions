class Solution {
    public boolean checkValidString(String s) {
        int len=s.length();
        int starCount=0,close=0,open=0;
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)=='*')
                starCount++;
            else if(s.charAt(i)==')')
                close++;
            else
                open++;
            if(open > close + starCount)
                return false;
        }
        open=0;
        close=0;
        starCount=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='*')
                starCount++;
            else if(s.charAt(i)==')')
                close++;
            else
                open++;
            if(close > open + starCount)
                return false;
        }
        return true;
    }

}
