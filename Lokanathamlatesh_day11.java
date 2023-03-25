import java.util.Scanner;
public class Lokanathamlatesh_day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        if (n < 0) {
            System.out.println("invalid input please Enter valid input");
        } else {
            for (int i = 0; i < n; i++) {
                c = a + b;
                System.out.print(a + ",");
                a = b;
                b = c;
            }
        }
    }
}
