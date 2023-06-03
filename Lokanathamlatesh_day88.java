import java.util.*;
public class Lokanathamlatesh_day88 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        while (t-- > 0) {

            int n = scanner.nextInt(); 
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int[] sortedArr = arr.clone();
            Arrays.sort(sortedArr); 
            int smallestIndex = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == sortedArr[0]) {
                    smallestIndex = i;
                    break;
                }
            }
            int[] shiftedArr = new int[n];
            for (int i = 0; i < n; i++) {
                shiftedArr[i] = arr[(i + smallestIndex) % n];
            }
            int[] result = shiftedArr.clone();
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = shiftedArr[i];
                    shiftedArr[i] = shiftedArr[j];
                    shiftedArr[j] = temp;
                    if (lexicographicallySmaller(shiftedArr, result)) {
                        result = shiftedArr.clone();
                    }
                    shiftedArr[j] = shiftedArr[i];
                    shiftedArr[i] = temp;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
    private static boolean lexicographicallySmaller(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < b[i]) {
                return true;
            } else if (a[i] > b[i]) {
                return false;
            }
        }
        return false;
    }
}
