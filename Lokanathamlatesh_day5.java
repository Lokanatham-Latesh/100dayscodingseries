import java.util.Scanner;
public class Lokanathamlatesh_day5{
    
    public static void main(String[] args) {
        
    
   System.out.println("Enter the number for checking even and condition ");
   
   Scanner sc = new Scanner(System.in);
     int num  = sc.nextInt();
      if(num%2 == 0){
        System.out.println("EVEN");
      }
      else{
        System.out.println("ODD");
      }
      sc.close();
   

    }
}
