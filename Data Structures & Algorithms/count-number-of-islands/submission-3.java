class Solution {
    private void bfs(char[][] grid, int r, int c){
        Queue<int[]> q = new ArrayDeque<>();
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        q.add(new int[]{r,c});
        grid[r][c]='0';
        while(!q.isEmpty()){
            int[] cell = q.poll();
            int cr = cell[0];
            int dr = cell[1];
            for(int[] d: dirs){
                int a = d[0] + cr;
                int b = d[1] + dr;
                if(a>=0 && b>=0 && a<grid.length && b<grid[0].length &&
                grid[a][b]=='1'){
                    grid[a][b]='0';
                    q.add(new int[]{a,b});
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    count++;
                    bfs(grid,i,j);
                }
            }
        }
        return count;
    }

}
