import java.util.Scanner;
public class Lokanathamlatesh_day77 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // size of array
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int maxTripletValue = findMaxTripletValue(arr);
            System.out.println(maxTripletValue);
        }
    }

    private static int findMaxTripletValue(int[] arr) {
        int max1 = Integer.MIN_VALUE; // maximum value
        int max2 = Integer.MIN_VALUE; // second maximum value
        int max3 = Integer.MIN_VALUE; // third maximum value
        int min1 = Integer.MAX_VALUE; // minimum value
        int min2 = Integer.MAX_VALUE; // second minimum value

        for (int num : arr) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        int option1 = (max1 - min1) * max1;
        int option2 = (max1 - min2) * max1;
        int option3 = (max2 - min1) * max2;
        int option4 = (max3 - min1) * max3;

        return Math.max(Math.max(option1, option2), Math.max(option3, option4));
    }  
}
