import java.util.*;
public class Lokanathamlatesh_day79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the binary string
            String s = scanner.next(); // Binary string
            int minOperations = findMinOperations(n, s);
            System.out.println(minOperations);
        }
    }
    private static int findMinOperations(int n, String s) {

        if (s.charAt(0) == '0' || s.charAt(n - 1) == '0') {
            return 1;
        }
        int consecutiveOnes = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                consecutiveOnes++;
            } else {
                break;
            }
        }
        if (consecutiveOnes == n) {
            return (n + 1) / 2;
        }
        if (s.charAt(0) == '1' && s.charAt(n - 1) == '1') {
            return 2;
        }
        return 1;
    }
}
