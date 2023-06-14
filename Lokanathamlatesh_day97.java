import java.util.*;
class Node {
    int color;
    List<Node> children;

    public Node(int color) {
        this.color = color;
        this.children = new ArrayList<>();
    }
}

public class Lokanathamlatesh_day97 {
  
    
    public static Node buildTree(int[] colors, int[][] edges) {
        int n = colors.length;
        Node[] nodes = new Node[n + 1];

        // Create nodes with their colors
        for (int i = 1; i <= n; i++) {
            nodes[i] = new Node(colors[i - 1]);
        }

        // Connect nodes with edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            nodes[u].children.add(nodes[v]);
            nodes[v].children.add(nodes[u]);
        }

        return nodes[1]; // Root of the tree is always node 1
    }

    // Function to calculate the minimum number of operations
    public static int getMinimumOperations(Node node, int[] targetColors) {
        return dfs(node, null, targetColors);
    }

    private static int dfs(Node node, Node parent, int[] targetColors) {
        int operations = 0;
        if (node.color != targetColors[node- 1]) {
            node.color = targetColors[node- 1];
            operations++;
        }

        for (Node child : node.children) {
            if (child != parent) {
                operations += dfs(child, node, targetColors);
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] initialColors = new int[n];
            int[] targetColors = new int[n];

            // Read initial colors
            for (int i = 0; i < n; i++) {
                initialColors[i] = scanner.nextInt();
            }

            // Read target colors
            for (int i = 0; i < n; i++) {
                targetColors[i] = scanner.nextInt();
            }

            int[][] edges = new int[n - 1][2];

            // Read edges
            for (int i = 0; i < n - 1; i++) {
                edges[i][0] = scanner.nextInt();
                edges[i][1] = scanner.nextInt();
            }

            Node root = buildTree(initialColors, edges);
            int minOperations = getMinimumOperations(root, targetColors);
            System.out.println(minOperations);
        }

        scanner.close();
    }
}
