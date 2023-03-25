import java.util.Scanner;
public class Lokanathamlatesh_day23 {  
 public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    int temp = 0;
     while(num>0){
     int lastdidit = num%10;
       if(lastdidit == 0){
        temp = (temp*10)+1;
       }
       else{
        temp = (temp*10)+lastdidit;}
       num /= 10;
     }
      num = 0;
      while(temp>0){
         int rem = temp%10;
         num = (num*10)+rem;
         temp/=10;}
      System.out.println("After removing all the zeros from the number "+ num);
 }}

