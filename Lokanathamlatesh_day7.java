import java.util.Scanner;
public class Lokanathamlatesh_day7{
  
 public static void Numberofdays(int year,int month){
   if(((year%4 == 0 && year %100 != 0) || (year%100 == 0 && year%400 == 0)) && month == 2 )
   {
     System.out.println("29 days in a  month that is leap year");
   }
   else if(month == 2){
    System.out.println("28 days in a month");
   }
   else if(month == 1 || month == 3 || month == 5 || month == 7|| month == 8 || month ==10 || month == 12 ){
        System.out.println("31 days in a month");
   }  
   else{
    System.out.println("30 days in a month");
   }
  }
    public static void main(String args[]){

      Scanner sc =  new Scanner(System.in);
       System.out.println("enter the year ");
       int year = sc.nextInt();
       System.out.println("enter the month");
       int month = sc.nextInt();
        Numberofdays(year,month);
    }
  
}
