import java.util.*;
public class Lokanathamlatesh_day58{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     System.out.println("Enter the Test Case");
     int T = sc.nextInt();
     int arr[] = new int[T];
     for(int i = 0;i<T;i++){
        System.out.println("Enter the capacity of Bucket In Liters");
        int k = sc.nextInt();
          System.out.println("Enter the Filled water in Bucket In Liters");
          int x = sc.nextInt();
          int result = k-x;
          arr[i] = result;
     }
        System.out.println("Result :");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


   } 
}
