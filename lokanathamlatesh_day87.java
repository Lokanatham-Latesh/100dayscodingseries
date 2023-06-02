import java.util.*;
public class lokanathamlatesh_day87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        while (T > 0) {
            int N = scanner.nextInt(); // Number of stones

            int[] stones = new int[N];
            for (int i = 0; i < N; i++) {
                stones[i] = scanner.nextInt(); // Values written on the stones
            }

            int minEnergy = calculateMinEnergy(stones);
            System.out.println(minEnergy);

            T--;
        }
    }

    private static int calculateMinEnergy(int[] stones) {
        int N = stones.length;
        int[] dp = new int[N];

        // Initialize dp array
        dp[0] = 0;

        for (int i = 1; i < N; i++) {
            dp[i] = Integer.MAX_VALUE;

            for (int j = 0; j < i; j++) {
                int d = i - j + 1;
                int energy = d * stones[i] - stones[j];

                // Update minimum energy required
                dp[i] = Math.min(dp[i], Math.max(dp[j], energy));
            }
        }

        return Math.max(dp[N - 1], 0); // Return the minimum non-negative energy required
    }
 
}
