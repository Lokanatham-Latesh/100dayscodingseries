import java.util.*;
public class Lokanathamlatesh_day78{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt(); // Length of the array
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt(); // Elements of the array
            }
            long sumOfWeights = calculateSumOfWeights(arr);
            System.out.println(sumOfWeights);
        }
        
        scanner.close();
    }
    
    public static long calculateSumOfWeights(int[] arr) {
        int n = arr.length;
        long sumOfWeights = 0;
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int weight = (arr[j] - arr[i]) * (arr[k] - arr[j]);
                    sumOfWeights += weight;
                }
            }
        }
        
        return sumOfWeights;
    }
}