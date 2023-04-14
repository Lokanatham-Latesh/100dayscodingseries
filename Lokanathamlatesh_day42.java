import java.util.*;
public class Lokanathamlatesh_day42{
  public static void main(String[] args) {
     System.out.println("Enter the size of 1st Array");
     Scanner sc = new Scanner(System.in);
     int size1 = sc.nextInt();
     System.out.println("Enter the size of 2nd Array");
     int size2 = sc.nextInt();
     int arr[] = new int[size1];
     int arr2[] = new int[size2];
        for(int i = 0;i<size1;i++){
            System.out.print("Enter " +i+"th element of array  ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<size2;i++){

            System.out.print("Enter " +i+"th element of 2ndarray  ");
        arr2[i] = sc.nextInt();
        }
        if(size1 == size2){
            
       for(int i = 0 ;i<size1;i++){
          if(arr[i] != arr2[i]){
            System.out.println("TWO ARRAYS ARE NOT SAME");
            return;
          }
       }
         System.out.println("TWO ARRAYS ARE SAME");

        }
        else{
            System.out.println("TWO ARRAYS ARE NOT EQUAL");
        }  } } 

