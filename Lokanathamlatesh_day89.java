import java.util.*;
public class Lokanathamlatesh_day89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // number of integers
            int k = scanner.nextInt(); // number of integers to choose in each step
            int c = scanner.nextInt(); // constant C

            int[] numbers = new int[n];
            for (int j = 0; j < n; j++) {
                numbers[j] = scanner.nextInt();
            }

            int maxSteps = calculateMaxSteps(numbers, k, c);
            System.out.println(maxSteps);
        }

        scanner.close();
    }

    private static int calculateMaxSteps(int[] numbers, int k, int c) {
        Arrays.sort(numbers);

        int maxSteps = 0;
        int remainingNumbers = numbers.length;

        while (remainingNumbers >= k) {
            maxSteps++;
            remainingNumbers -= k;
            k *= c;
        }

        return maxSteps;
    }  
}
