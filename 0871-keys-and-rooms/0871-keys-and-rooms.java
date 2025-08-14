class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];

        dfs(0, rooms, visited);

        for(boolean val : visited){
            if(!val) return false;
        }
        return true;
    }

    private static void dfs(int room, List<List<Integer>> rooms, boolean[] visited){
        //return if already visisted to that room
        if(visited[room]) return;
        visited[room] = true;

        //as we registered visied array, now we need to  call this dfs back recursively
        for(int key : rooms.get(room)){
            dfs(key, rooms, visited);
        }
    }
}