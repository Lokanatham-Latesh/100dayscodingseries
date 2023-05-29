import java.util.Scanner;
public class Lokanathamlatesh_day83 {
   
    private static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H;

        while ((H = scanner.nextInt()) != 0) {
            int numNodes = (1 << H) - 1;
            long[] values = new long[numNodes];
            for (int i = 0; i < numNodes; i++) {
                values[i] = scanner.nextLong();
            }

            long result = calculateP1(values, 0);
            System.out.println(result);
        }
    }

    private static long calculateP1(long[] values, int nodeIndex) {
        int numNodes = values.length;
        if (nodeIndex >= numNodes) {
            return 0; // Base case: out of bounds
        }

        long leftChildValue = calculateP1(values, 2 * nodeIndex + 1);
        long rightChildValue = calculateP1(values, 2 * nodeIndex + 2);

        if (2 * nodeIndex + 1 >= numNodes) {
            return values[nodeIndex]; // Base case: leaf node
        }

        long maxChildValue = Math.max(leftChildValue, rightChildValue);
        return (values[nodeIndex] * maxChildValue) % MOD;
    }
}
