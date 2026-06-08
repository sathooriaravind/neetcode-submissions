class Solution {
    public void bfs(char[][] board,int r,int c){
        Queue<int[]> q = new ArrayDeque<>();
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}}; 
        q.add(new int[]{r,c});
        board[r][c]='1';
        while(!q.isEmpty()){
            int[] cell = q.poll();
            int cr = cell[0];
            int dr = cell[1];
            for(int[] d: dirs){
                int a = d[0] + cr;
                int b = d[1] + dr;
                if(a>=0 && b>=0 && a<board.length && b<board[0].length &&
                board[a][b]=='O'){
                    q.add(new int[]{a,b});
                    board[a][b]='1';
                }
            }
        }
    }
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            if(board[i][0]=='O')
                bfs(board,i,0);
        }
        for(int i=0;i<m;i++){
            if(board[i][n-1]=='O')
                bfs(board,i,n-1);
        }
        for(int i=0;i<n;i++){
            if(board[0][i]=='O')
                bfs(board,0,i);
        }
        for(int i=0;i<n;i++){
            if(board[m-1][i]=='O')
                bfs(board,m-1,i);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                if(board[i][j]=='1')
                    board[i][j]='O';
            }
        }
    }
}
