import java.util.Scanner;
public class Lokanathamlatesh_day81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // length of the binary string
            String s = scanner.next(); // binary string

            int minOperations = getMinOperations(n, s);
            System.out.println(minOperations);
        }
    }

    private static int getMinOperations(int n, String s) {
        int minOperations = 0;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            // Check if the string is already sorted
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) < s.charAt(i - 1)) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                break;
            }

            // Find the longest decreasing subsequence
            int start = -1;
            int end = -1;

            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) > s.charAt(i + 1)) {
                    start = i;
                    break;
                }
            }

            for (int i = n - 1; i > 0; i--) {
                if (s.charAt(i) < s.charAt(i - 1)) {
                    end = i;
                    break;
                }
            }

            // Reverse the substring to make it increasing
            StringBuilder sb = new StringBuilder(s.substring(start, end + 1));
            sb.reverse();

            s = s.substring(0, start) + sb.toString() + s.substring(end + 1);
            minOperations++;
        }

        return minOperations;
    } 
}
