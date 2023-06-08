import java.util.*;
public class Lokanathamlatesh_day93 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of users

        // Read the friendship relations
        int[][] friendships = new int[n][n];
        for (int i = 0; i < n; i++) {
            String row = scanner.next();
            for (int j = 0; j < n; j++) {
                friendships[i][j] = row.charAt(j) - '0';
            }
        }

        int suggestions = countFriendshipSuggestions(n, friendships);
        System.out.println(suggestions);

        scanner.close();
    }

    private static int countFriendshipSuggestions(int n, int[][] friendships) {
        int suggestions = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (friendships[i][j] == 0) { // If users i and j are not friends
                    for (int k = 0; k < n; k++) {
                        if (k != i && k != j && friendships[i][k] == 1 && friendships[j][k] == 1) {
                            suggestions++;
                        }
                    }
                }
            }
        }

        return suggestions;
    }  
}
