import java.util.*;
public class Lokanathamlatesh_day86 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // number of elements in A
            int subsetSize = (int) Math.pow(2, n);

            int[] subsetSums = new int[subsetSize];
            for (int i = 0; i < subsetSize; i++) {
                subsetSums[i] = scanner.nextInt(); // values written on paper
            }

            int[] beautifulArray = rebuildBeautifulArray(n, subsetSums);
            for (int num : beautifulArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static int[] rebuildBeautifulArray(int n, int[] subsetSums) {
        Arrays.sort(subsetSums);
        int[] beautifulArray = new int[n];

        beautifulArray[n - 1] = subsetSums[1];
        for (int i = n - 2; i >= 0; i--) {
            beautifulArray[i] = subsetSums[i + 2] - subsetSums[i + 1];
        }

        return beautifulArray;
    }

}
