import java.util.ArrayList;
import java.util.List;

class Solution {
    private int minDifference = Integer.MAX_VALUE; 

    public int solution(int n, int[][] wires) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] wire : wires) {
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }

        for (int[] wire : wires) {
            int u = wire[0];
            int v = wire[1];

            graph.get(u).remove((Integer) v);
            graph.get(v).remove((Integer) u);

            int size = dfs(graph, u, new boolean[n + 1]);
            int difference = Math.abs(size - (n - size));
            minDifference = Math.min(minDifference, difference);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return minDifference;
    }

    private int dfs(List<List<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        int size = 1; 

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                size += dfs(graph, neighbor, visited);
            }
        }

        return size;
    }
}
