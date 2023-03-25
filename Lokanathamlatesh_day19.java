import java.util.Scanner;
public class Lokanathamlatesh_day19 {
public static void main(String[] args) {
    System.out.println("Enter the number to check whether it is Armstrong or not");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int temp = num;
    int count = 0;
    int result = 0;
    if(num<=0){
        System.out.println("Invalid number enter more than Zero");
        return;
    }
    while(num>0){
        num/=10;
        count++;
    }
    num = temp;
      while(num>0){
      int lastdigit = num%10;
       result += Math.pow(lastdigit,count);
      num/= 10;
      }
      
      if(result == temp){
        System.out.println("Armstrong Number");
      }
      else{
        System.out.println("Not a Armstrong Number");
      }
      sc.close();
}
}
