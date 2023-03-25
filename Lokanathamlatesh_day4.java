import java.util.Scanner;
public class Lokanathamlatesh_day4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            System.out.println("enter the number you want check ");
         int num = sc.nextInt();
          if(num >0){
            System.out.println("positive number");
          }
          else if(num<0){
            System.out.println("negative number");
          }
          else{
            System.out.println("you entered ZERO 0️⃣");
          }
          sc.close();
        
    }
    
}
