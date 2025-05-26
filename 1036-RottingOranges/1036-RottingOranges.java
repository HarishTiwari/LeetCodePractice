// Last updated: 5/27/2025, 12:46:04 AM
class Solution {
    public int orangesRotting(int[][] grid) {

        Queue<Pair> queue = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;

        // iterating on the matrix
        for(int i=0; i < grid.length ; i++){
            for(int j=0 ; j < grid[i].length ; j++){
                if(grid[i][j] == 2){
                    queue.add(new Pair(i,j,0));
                }
            }
        }
        
        // BFS logic 
        int ans = 0;
        while(!queue.isEmpty()){
            Pair temp = queue.poll();
            int crow = temp.row;
            int ccol = temp.col;
            int ctime = temp.time;

            ans = ctime;

            // crow - 1 , ccol
            if(crow - 1 >= 0 && grid[crow-1][ccol] ==1){
                queue.add(new Pair(crow-1,ccol,ctime + 1));
                grid[crow-1][ccol] = 2;
            }

            // crow , ccol - 1
            if(ccol - 1 >= 0  && grid[crow][ccol-1]==1){
                queue.add(new Pair(crow,ccol-1,ctime+1));
                grid[crow][ccol-1] = 2;
            }

            // crow + 1 , ccol
            if(crow + 1 < n && grid[crow+1][ccol] == 1){
                queue.add(new Pair(crow+1,ccol,ctime+1));
                grid[crow+1][ccol] = 2;
            }

            // crow , ccol + 1
            if(ccol +1 < m && grid[crow][ccol+1] == 1){
                queue.add(new Pair(crow,ccol+1,ctime+1));
                grid[crow][ccol+1] = 2;
            }
        }

        // iterating on the matrix
        for(int i=0; i < grid.length ; i++){
            for(int j=0 ; j < grid[0].length ; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }

        return ans;
    }
}

class Pair {
    int row;
    int col;
    int time;

    Pair(int row , int col , int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }        
}