class Solution {
public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;


        int m = grid.length, n = grid[0].length;
        int islands = 0;


        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        Queue<int[]> q = new LinkedList<>();


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    grid[i][j] = '0'; // mark visited
                    q.offer(new int[] { i, j }); // start BFS


                    while (!q.isEmpty()) {
                        int[] cell = q.poll();
                        int r = cell[0], c = cell[1];


                        for (int[] d : dirs) {
                            int nr = r + d[0];
                            int nc = c + d[1];


                            if (nr >= 0 && nc >= 0 && nr < m && nc < n
                                    && grid[nr][nc] == '1') {
                                grid[nr][nc] = '0';
                                q.offer(new int[] { nr, nc });
                            }
                        }
                    }
                }
            }
        }
        return islands;
    }

}
