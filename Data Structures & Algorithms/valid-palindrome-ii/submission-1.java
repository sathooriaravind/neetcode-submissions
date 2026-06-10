class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, h = s.length() - 1;
        while (l < h) {
            if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(h))) {
                l++;
                h--;
            } else {
                break;
            }
        }
        if(l>=h)
            return true;
        int low = l;
        int high = h;
        if(Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(h - 1))) {
            h=h-2;
            l=l+1;
            while (l < h) {
                if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(h))) {
                    l++;
                    h--;
                } else {
                    break;
                }
            }
            if(l>=h)
                return true;
        }
        l = low;
        h = high;
        if(Character.toLowerCase(s.charAt(l+1)) == Character.toLowerCase(s.charAt(h))){
            l=l+2;
            h=h-1;
            while (l < h) {
                if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(h))) {
                    l++;
                    h--;
                } else {
                    return false;
                }
            }
            if(l>=h)
                return true;
        }
        return false;
    }
}