import java.util.*;
public class Lokanathamlatesh_day90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of testcases
        while (t-- > 0) {
            int n = scanner.nextInt(); // length of the string
            int p = scanner.nextInt(); // points to spend
            String s = scanner.next(); // string S
            String result = getLexicographicallySmallestString(n, p, s);
            System.out.println(result);}}
    public static String getLexicographicallySmallestString(int n, int p, String s) {
        char[] chars = s.toCharArray();
        int[] count = new int[26]; 
        for (char c : chars) {
            count[c - 'a']++;}
        for (char c = 'a'; c <= 'z' && p > 0; c++) {
            for (int i = 0; i < n; i++) {
                if (p == 0)
                    break;
                if (chars[i] > c) {
                    int pointsNeeded = chars[i] - c;
                    if (pointsNeeded <= p) {
                        p -= pointsNeeded;
                        count[chars[i] - 'a']--;
                        chars[i] = c;
                    }
                }
            }
        }
        for (int i = n - 1; i >= 0 && p > 0; i--) {
            if (chars[i] != 'a') {
                chars[i] = 'a';
                p -= 2;
                count['a' - 'a']++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < count[i]; j++) {
                sb.append((char) ('a' + i));
            }
        }

        return sb.toString();
    }
}
