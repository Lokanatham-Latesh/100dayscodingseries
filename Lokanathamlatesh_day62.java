import java.util.*;
public class Lokanathamlatesh_day62{
    public static void main(String[] args) {
        System.out.println("Enter the Number of Testcase");
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         for(int i = 0;i<t;i++){
            System.out.println("Enter the number of decided to go goldmine");
            int n = sc.nextInt();
             System.out.println("Enter Total gold contains in gold mine and Enter the  capacity of gold that person can carry ");
               int x = sc.nextInt();
               int y = sc.nextInt();
               if((n+1)*y >= x){
                System.out.println("YES");
               }
               else{
                System.out.println("NO");
               }

            }
    }
}
