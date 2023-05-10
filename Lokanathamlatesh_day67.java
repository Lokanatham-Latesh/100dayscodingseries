import java.util.*;
public class Lokanathamlatesh_day67{
    public static void main(String[] args) {
        System.out.println("Enter the number of testcase");
    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0;i<t;i++) {
            int s = scanner.nextInt();
            int w1 = scanner.nextInt();
            int w2 = scanner.nextInt();
            int w3 = scanner.nextInt();
            int res  = 0;
            int[] w = {w1, w2, w3};
            Arrays.sort(w);
            if (w[0] + w[1] + w[2] <= s) {
                res = 1;
            } else if (w[0] + w[1] <= s || w[1] + w[2] <= s) {
                res = 2;
            } else {
                res = 3;
            }
            System.out.println(res);
        }   
        }
    }



