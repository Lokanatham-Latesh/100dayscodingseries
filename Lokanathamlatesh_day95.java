import java.util.*;
public class Lokanathamlatesh_day95 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // original integer with Kulyash
            int count = 0; // to keep track of the number of operations
            
            while (n > 0) {
                if (isPowerOfTwo(n)) {
                    break; // no further operations required, n is already a power of 2
                } else {
                    int power = highestPowerOfTwo(n);
                    n -= (int) Math.pow(2, power); // subtract the highest power of 2 from n
                    count++; // increment the operation count
                }
            }
            
            System.out.println(count);
        }
    }
    
    // Check if a number is a power of 2
    private static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }
    
    // Find the highest power of 2 less than or equal to n
    private static int highestPowerOfTwo(int n) {
        int power = 0;
        
        while (n > 1) {
            n /= 2;
            power++;
        }
        
        return power;
    }  


}
