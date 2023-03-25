import java.util.Scanner;
public class Lokanathamlatesh_day12{
    public static void main(String[] args) {
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
   int num  = sc.nextInt();
   int sum =0; 
   
   if(num<0){
         num = Math.abs(num);// it converts negative value to positive 
     }
     while(num>0){
    int rem = num%10;
    sum+= rem;
    num = num/10;
     }
    
     System.out.println("sum of digits in a number = \t"+ sum);

        sc.close();
    }

}
