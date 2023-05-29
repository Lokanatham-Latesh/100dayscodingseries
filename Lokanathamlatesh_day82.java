import java.util.Scanner;
public class Lokanathamlatesh_day82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // number of strings and length of strings

            // Read the given strings
            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = scanner.next();
            }

            String result = getDifferentBinaryString(n, strings);
            System.out.println(result);
        }
    }

    private static String getDifferentBinaryString(int n, String[] strings) {
        StringBuilder result = new StringBuilder();

        // Create a binary string that differs from all given strings
        for (int i = 0; i < n; i++) {
            if (strings[i].charAt(i) == '0') {
                result.append('1');
            } else {
                result.append('0');
            }
        }

        return result.toString();
    }  
}
