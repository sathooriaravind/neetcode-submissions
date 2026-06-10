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
        int low = 1,high=len-2;
        int mid=0;
        while(low<=high){
            mid = low + (high-low)/2 ;
            int midVal = mountainArr.get(mid);
            if(midVal==target)
                return mid;
            int left = mountainArr.get(mid-1);
            int right = mountainArr.get(mid+1);
            if(left < midVal && midVal < right){
                low=mid+1;
            }
            else if(left > midVal && midVal > right){
                high = mid-1;
            }
            else
                break;
        }
        low = 0;
        high = mid;
        while(low <= high){
            mid = low + (high-low)/2 ;
            int midVal = mountainArr.get(mid);
            if(midVal==target)
                return mid;
            if(target < midVal){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        low=mid;
        high=len-1;
        while(low <= high){
            mid = low + (high-low)/2 ;
            int midVal = mountainArr.get(mid);
            if(midVal==target)
                return mid;
            if(target > midVal){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}