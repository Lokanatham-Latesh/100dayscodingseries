import java.util.*;
public class Lokanathamlatesh_day55{
   public static void main(String[] args) {
    int arr[] = {1,4,2,3};
    int arr1[] = {7,5,8,6};
    int maxproduct  = 0;
       Arrays.sort(arr);
      Arrays.sort(arr1);
      for(int i = arr.length-1;i>=0;i--){
       maxproduct+= arr[i]*arr1[i];
      }
    System.out.print("Sum of maximum dot product of two vectors = " +maxproduct);
   } 
}
