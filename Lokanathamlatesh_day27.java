import java.util.Scanner;
public class Lokanathamlatesh_day27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to make Double");
    int num = sc.nextInt();
    dOuble d1 = new dOuble();
    System.out.print(d1.makedouble(num));
  }  
}
class dOuble{
    int makedouble(int num){
      return (num<<1);
    }}

