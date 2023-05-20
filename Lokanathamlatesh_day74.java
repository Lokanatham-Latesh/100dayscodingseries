import java.util.*;
public class Lokanathamlatesh_day74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            int m = scanner.nextInt(); 
            int min1x1Tiles = 0; 
            if (n % 2 != 0 || m % 2 != 0) {
                min1x1Tiles = (n * m + 1) / 2;
            }
            
            System.out.println(min1x1Tiles);
        }
    } 
}
