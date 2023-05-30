import java.util.*;
public class Lokanathamlatesh_day84 {
    public static void main(String[] args) {
        int N = 4;
        int M = 3;
        int E = 5;
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {3, 0}, {0, 2}};

        GraphColoring graph = new GraphColoring(N, M);
        for (int[] edge : edges) {
            graph.addEdge(edge[0], edge[1]);
        }

        if (graph.canColorGraph()) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
class GraphColoring {
    private int V; // number of vertices
    private int M; // number of colors
    private ArrayList<ArrayList<Integer>> graph;

    GraphColoring(int v, int m) {
        V = v;
        M = m;
        graph = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    boolean canColorGraph() {
        int[] colors = new int[V];
        return colorVertex(0, colors);
    }

    boolean colorVertex(int v, int[] colors) {
        if (v == V) {
            return true; // All vertices are colored
        }

        for (int color = 1; color <= M; color++) {
            if (isSafe(v, color, colors)) {
                colors[v] = color;

                // Recur for the next vertex
                if (colorVertex(v + 1, colors)) {
                    return true;
                }

                // If coloring vertex v with color 'color' doesn't lead to a solution,
                // then backtrack and try other colors
                colors[v] = 0;
            }
        }

        return false; // No color can be assigned to this vertex
    }
    boolean isSafe(int v, int color, int[] colors) {
        // Check if any adjacent vertex has the same color
        for (int adj : graph.get(v)) {
            if (colors[adj] == color) {
                return false;
            }
        }
        return true;
    }
}

