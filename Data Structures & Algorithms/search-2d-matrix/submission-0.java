class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int start=0;
        while(start<rowCount){
            int l=0,h=colCount-1;
            while(l<=h){
                int m = l + (h-l)/2;
                if(matrix[start][m]==target)
                    return true;
                else if(matrix[start][m]>target)
                    h=m-1;
                else
                    l=m+1;
            }
            start++;
        }
        return false;
    }
}
