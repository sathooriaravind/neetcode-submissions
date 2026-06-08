class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        Queue<int[]> q = new ArrayDeque<>();
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0)
                    q.add(new int[]{i,j});
            }
        }
        while(!q.isEmpty()){
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];

            for(int[] d: dirs){
                int a = r + d[0];
                int b = c + d[1];

                if(a>=0 && b>=0 && a<m && b<n && grid[a][b]==Integer.MAX_VALUE){
                    grid[a][b]=grid[r][c]+1;
                    q.add(new int[]{a,b});
                }
            }
        }

    }
}
