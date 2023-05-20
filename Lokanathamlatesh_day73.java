import java.util.*;
public class Lokanathamlatesh_day73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            String s = scanner.next(); 
            int maxLength = 0;
            Set<Character> distinctChars = new HashSet<>(); 
            for (int i = 0; i < n; i++) {
                char currentChar = s.charAt(i);
                if (distinctChars.contains(currentChar)) {
                 
                    maxLength = Math.max(maxLength, 1);
                } else {
                    distinctChars.add(currentChar);
                }
            }  
            System.out.println(maxLength);
        }
    }
}
