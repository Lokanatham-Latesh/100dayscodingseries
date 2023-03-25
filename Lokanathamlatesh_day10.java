
import java.util.Scanner;
public class Lokanathamlatesh_day10{
    
   public static void main(String[] args) {
    System.out.println("Enter the number to find factorial");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int fact = 1;
    for(int i =1;i<=num;i++){
        fact*=i;
    }    
    System.out.println("Factorial of a number  = " +fact);

    sc.close();
   } 
}
