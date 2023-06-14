import java.util.*;
public class Lokanathamlatesh_day96 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (t > 0) {
            String x = scanner.nextLine();
            String y = scanner.nextLine();

            String z = findArrangement(x, y);
            System.out.println(z);

            t--;
        }

        scanner.close();
    }

    private static String findArrangement(String x, String y) {
        int n = x.length();
        StringBuilder z = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            if (x.charAt(i) == y.charAt(i)) {
                // If both balls have the same color, we can choose any color for Z
                z.append(x.charAt(i));
            } else {
                // Choose the lexicographically smallest color for Z
                z.append('B');
            }
        }

        return z.toString();
    }

}
