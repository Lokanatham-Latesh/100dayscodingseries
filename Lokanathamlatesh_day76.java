import java.util.*;
public class Lokanathamlatesh_day76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        
        while (T-- > 0) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int C = scanner.nextInt();
            
            int[] numbers = new int[N];
            for (int i = 0; i < N; i++) {
                numbers[i] = scanner.nextInt();
            }
            
            int result = calculateMaxSteps(numbers, K, C);
            System.out.println(result);
        }
        
        scanner.close();
    }
    
    private static int calculateMaxSteps(int[] numbers, int K, int C) {
        Arrays.sort(numbers); // Sort the array in ascending order
        
        int maxSteps = 0;
        int remainingNumbers = numbers.length;
        
        while (remainingNumbers >= K) {
            // Check if the K numbers satisfy the condition
            boolean isValid = true;
            for (int i = 1; i < K; i++) {
                if (numbers[i] < numbers[i - 1] * C) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                maxSteps++;
                remainingNumbers -= K;
                numbers = Arrays.copyOfRange(numbers, K, numbers.length); 
            } else {
                break;
            }
        }
        
        return maxSteps;
    }
}
