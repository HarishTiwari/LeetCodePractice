// Last updated: 5/27/2025, 12:45:42 AM
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        List<List<Integer>> graph = construction(n,edges);
    
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visitedArr = new boolean[n];
        queue.add(source);
        visitedArr[source] = true;

        while(!queue.isEmpty()){
            int temp = queue.poll();

            // early exit if found
            if(temp == destination){
                return true;
            }

            // iterating on neighbours
            for(Integer x : graph.get(temp)){
                if(visitedArr[x] == false){
                    queue.add(x);
                    visitedArr[x]=true;
                }
            }
        }

        return visitedArr[destination];

    }

    public List<List<Integer>> construction(int n , int[][] edges){

        List<List<Integer>> graph = new ArrayList<>();
        
        // forming list of nodes (rows)
        for(int i=0 ; i < n ; i++){
            graph.add(new ArrayList<>());
        }

        // adding element to the each row ( adding neighbours)
        for(int i=0 ; i < edges.length; i++){
            int first = edges[i][0];
            int second = edges[i][1];

            graph.get(first).add(second);
            graph.get(second).add(first);
        }

        return graph;

    }
}