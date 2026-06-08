class Solution {
    public void bfs(int[][] grid, boolean[][] visited,int r,int c,int[] area){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length)
            return ;
        if(grid[r][c]==0)
            return ;
        visited[r][c]=true;
        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{r,c});
        while(!q.isEmpty()){
            int[] cell = q.poll();
            for(int[] d: dirs){
                int a = cell[0] + d[0];
                int b = cell[1] + d[1];
                if(a>=0 && b>=0 && a<grid.length && b<grid[0].length && grid[a][b]==1 && !visited[a][b]){
                    area[0]++;
                    visited[a][b]=true;
                    q.add(new int[]{a,b});
                } 
            }
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int[] area = {0};
        int maxArea = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    area[0] = 1;
                    bfs(grid,visited,i,j,area);
                    maxArea = Math.max(maxArea,area[0]);
                }
            }
        }
        return maxArea;
    }
}
