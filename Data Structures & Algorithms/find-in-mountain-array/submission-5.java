/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len = mountainArr.length();
        int l = 0,h=len-1;
        int m=0;
        while(l<h){
            m = l + (h-l)/2 ;
            int mid = mountainArr.get(m);
            int right = mountainArr.get(m+1);
            if(mid < right){
                l=m+1;
            }
            else{
                h = m;
            }
        }
        int peak = l;
        h = peak;
        l = 0;
        while(l <= h){
            m = l + (h-l)/2 ;
            int mid = mountainArr.get(m);
            if(mid==target)
                return m;
            if(target < mid){
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
        l=peak;
        h=len-1;
        while(l <= h){
            m = l + (h-l)/2 ;
            int mid = mountainArr.get(m);
            if(mid==target)
                return m;
            if(target > mid){
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
        return -1;
    }
}