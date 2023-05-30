import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Lokanathamlatesh_day85 {
    
    private static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {
            String[] params = br.readLine().split(" ");
            int N = Integer.parseInt(params[0]);
            int M = Integer.parseInt(params[1]);
            int L = Integer.parseInt(params[2]);

            String S = br.readLine().trim();
            String nodes = br.readLine().trim();

            List<Integer>[] graph = new ArrayList[N + 1];
            for (int i = 1; i <= N; i++) {
                graph[i] = new ArrayList<>();
            }

            String[] u = br.readLine().split(" ");
            String[] v = br.readLine().split(" ");

            for (int i = 0; i < M; i++) {
                int uNode = Integer.parseInt(u[i]);
                int vNode = Integer.parseInt(v[i]);
                graph[uNode].add(vNode);
                graph[vNode].add(uNode);
            }

            int[][] dp = new int[N + 1][L + 1];
            for (int[] row : dp) {
                Arrays.fill(row, -1);
            }

            int result = countBeautifulPaths(1, S.charAt(0), 1, L, graph, dp);
            System.out.println(result);
        }
    }

    private static int countBeautifulPaths(int node, char c, int length, int L, List<Integer>[] graph, int[][] dp) {
        if (length == L) {
            return 1;
        }

        if (dp[node][length] != -1) {
            return dp[node][length];
        }

        int count = 0;
        for (int next : graph[node]) {
            if (c == c) {
                count = (count + countBeautifulPaths(next, c, length + 1, L, graph, dp)) % MOD;
            } else {
                count = (count + countBeautifulPaths(next, c, length + 1, L, graph, dp)) % MOD;
                count = (count + countBeautifulPaths(next, c, length, L, graph, dp)) % MOD;
            }
        }

        dp[node][length] = count;
        return count;
    }
}
