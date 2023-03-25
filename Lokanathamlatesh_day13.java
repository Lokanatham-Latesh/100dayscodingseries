import java.util.Scanner;
public class Lokanathamlatesh_day13{
     public static void main(String[] args) {
     System.out.println("Enter the number");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int sum = 0;
     if(n<0){
        System.out.println("please enter valid number should be greater than zero");
     }else{
     for(int i = 1;i<=n;i++){
       sum+=i;
     }
    }
    System.out.println("sum of natural number "+sum);
      sc.close();
     }




}
