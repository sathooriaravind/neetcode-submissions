class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new ArrayDeque<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2)
                    q.add(new int[]{i,j});
            }
        }
        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        while(!q.isEmpty()){
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];
            for(int[] d: dirs){
                int a = r + d[0];
                int b = c + d[1];
                if(a>=0 && b >=0 && a < m && b < n && grid[a][b]==1){
                    grid[a][b] = 1 + grid[r][c];
                    q.add(new int[]{a,b});
                }
            }
        }
        int maxTime = 2;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                    return -1;
                if(grid[i][j]>2)
                    maxTime = Math.max(maxTime,grid[i][j]);
            }
        }
        return maxTime - 2 ;
    }
}
