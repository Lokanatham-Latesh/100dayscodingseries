import java.util.*;
public class Lokanathamlatesh_day68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numQueries = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
            for (int i = 0; i < numQueries; i++) {
                int queryType = scanner.nextInt();
                int number = scanner.nextInt();
        
                if (queryType == 1) {
                    set.add(number);
                } else if (queryType == 2) {
                    set.remove(number);
                } else if (queryType == 3) {
                    if (set.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            }
            scanner.close();
        }
}
