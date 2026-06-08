class Solution {
    public boolean validTree(int n, int[][] edges) {
        int len = edges.length;
        if(len!=n-1)
            return false;
        boolean[] visited = new boolean[n];
        int[][] graph = new int[n][n];
        for(int i=0;i<len;i++){
            graph[edges[i][0]][edges[i][1]]=1;
            graph[edges[i][1]][edges[i][0]]=1;
        }
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        visited[0]=true;
        int count = 1;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int i=0;i<n;i++){
                if(graph[node][i]==1 && !visited[i]){
                    count++;
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return count==n;
    }
}
