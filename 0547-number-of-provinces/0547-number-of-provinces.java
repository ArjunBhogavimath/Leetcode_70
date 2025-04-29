class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        //add empty lists
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<Integer>());
        }

        //convert array to list for ease of access
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j] == 1 && i != j){
                    adjList.get(j).add(i);
                    adjList.get(i).add(j);
                }
            }
        } 
        //adjlist is ready

        //step 2 we need visited array
        int visited[] =  new int[n+1];
        int count = 0;

        //now for dfs i need to itrerate throught the array and call dfs
        for(int i=0;i<n;i++){
            if(visited[i] == 0){
                count++;
                dfs(i, adjList, visited);
            }
        }
        return count;
    }

    public void dfs(int node, ArrayList<ArrayList<Integer>> adjList, int[] visited){
        visited[node] = 1; //mark visisted

        for(int it : adjList.get(node)){
            if(visited[it] == 0){ //not visited only
                dfs(it,adjList, visited);   
            }
        }
    } 
}