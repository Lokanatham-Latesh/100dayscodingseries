import java.util.Scanner;
public class Lokanathamlatesh_day71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            int[] scores = new int[n];
            for (int i = 0; i < n; i++) {
                scores[i] = scanner.nextInt();}
            int count = 0;
            for (int i = 0; i < n; i++) {
                int lessCount = 0;
                int greaterCount = 0;
                for (int j = 0; j < n; j++) {
                    if (scores[j] <= scores[i]) {
                        lessCount++;
                    } else {
                        greaterCount++;
                    }}
                if (lessCount > greaterCount) {
                    count++;
                }}
            System.out.println(count);
        }
    }
}
