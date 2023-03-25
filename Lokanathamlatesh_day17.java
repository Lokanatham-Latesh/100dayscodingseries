import java.util.*;
public class Lokanathamlatesh_day17 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
          Scanner sc = new Scanner(System.in);
          int num  = sc.nextInt();
          for(int i = 1;i<=num;i++){
             if(num%i ==0){
                System.out.println(i);
             }
          }
    }
}
