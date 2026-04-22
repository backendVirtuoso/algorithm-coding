import java.util.*;

class Solution {
    public int solution(int n, int[][] vertex) {
        List<List<Integer>> graph = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : vertex) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        
        queue.offer(1);
        visited[1] = true;

        int maxDistance = 0; 
        int count = 0; 
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            count = 0; 
            
            for (int i = 0; i < size; i++) {
                int currentNode = queue.poll();
                
                for (int neighbor : graph.get(currentNode)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.offer(neighbor);
                    }
                }
            }
            
            maxDistance++;
            count = size; 
        }

        return count; 
    }
}
