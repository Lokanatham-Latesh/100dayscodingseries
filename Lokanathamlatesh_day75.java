import java.util.*;
public class Lokanathamlatesh_day75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            int k = scanner.nextInt();
            int bites = 0; 
            if (n < k) {
                bites = -1;
            } else if (n % k == 0) {
                bites = n / k;
            } else {
                bites = -1;
            }
            
            System.out.println(bites);
        }
    }
}
