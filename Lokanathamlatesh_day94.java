import java.util.*;
public class Lokanathamlatesh_day94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // number of gnomes

        // Read the friendship matrix
        int[][] friendships = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                friendships[i][j] = scanner.nextInt();
            }
        }

        int M = scanner.nextInt(); // number of queries

        for (int query = 0; query < M; query++) {
            int K = scanner.nextInt(); // minutes
            int x = scanner.nextInt(); // gnome id

            List<Integer> spreadGnomes = new ArrayList<>();
            spreadGnomes.add(x); // Initially, the gnome with id x knows the joke

            // Simulate the joke spread for K minutes
            for (int minutes = 0; minutes < K; minutes++) {
                List<Integer> newGnomes = new ArrayList<>();
                for (int gnome : spreadGnomes) {
                    for (int i = 0; i < N; i++) {
                        if (friendships[gnome - 1][i] == 1 && !spreadGnomes.contains(i + 1) && !newGnomes.contains(i + 1)) {
                            newGnomes.add(i + 1);
                        }
                    }
                }
                spreadGnomes.addAll(newGnomes);
            }

            // Sort the gnomes in increasing order
            Collections.sort(spreadGnomes);

            System.out.println(spreadGnomes.size());
            if (spreadGnomes.isEmpty()) {
                System.out.println("-1");
            } else {
                for (int gnome : spreadGnomes) {
                    System.out.print(gnome + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
    
}
