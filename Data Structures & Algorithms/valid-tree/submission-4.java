class Solution {
    public boolean validTree(int n, int[][] edges) {
        int len = edges.length;
        if(len!=n-1)
            return false;
        boolean[] visited = new boolean[n];
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int i=0;i<len;i++){
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        visited[0]=true;
        int count = 1;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int nei : graph.get(node)){
                if(!visited[nei]){
                    count++;
                    visited[nei] = true;
                    q.add(nei);
                }
            }
        }
        return count==n;
    }
}
