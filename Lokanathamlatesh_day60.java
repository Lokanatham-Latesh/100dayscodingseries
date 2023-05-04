import java.util.*;
public class Lokanathamlatesh_day60{
   public static void main(String[] args) {
    System.out.println("Enter  the  Number of Testcase");
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int arr[] = new int[7];
    int sunny = 0;
    int rainy = 0;
   System.out.println("Enter 1 for Sunny days or 0 for Rainy days ");
   for(int i = 0;i<t;i++){
      for(int j = 0;j<arr.length;j++){
        arr[i]= sc.nextInt();
        if(arr[i] == 1){
         sunny++;
        }
        else{
        rainy++;
        }
      }
      if(sunny>rainy){
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
      System.out.println("Enter 1 for Sunny days or 0 for Rainy days for next IterationR ");

   }

   } 
}
