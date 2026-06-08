class Solution {
    public void dfs(char[][] grid, boolean[][] visited, int r, int c){
        if(r<0 || c <0 || r >= grid.length || c >= grid[0].length)
            return ;
        if(grid[r][c]=='0' || visited[r][c])
            return ;
        visited[r][c]=true;
        dfs(grid,visited,r,c-1);
        dfs(grid,visited,r,c+1);
        dfs(grid,visited,r-1,c);
        dfs(grid,visited,r+1,c);
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
                    dfs(grid,visited,i,j);
                }
            }
        }
        return count;
    }
}
