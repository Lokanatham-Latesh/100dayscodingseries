import java.util.Scanner;
public class Lokanathamlatesh_day21{
   public static void main(String[] args) {
    System.out.println("Enter the number to check palindrome");
    Scanner sc = new Scanner(System.in);
    int num  = sc.nextInt();
    int temp = num;
    int result = 0;
    while(num>0){
     int lastdigit = num%10;
        result = (result*10)+(lastdigit);
        num/=10;
    }
     if(temp == result){
        System.out.println("Palindrome");
     }
     else{
        System.out.println("Not a Palindrome");
     }
   } 
}
