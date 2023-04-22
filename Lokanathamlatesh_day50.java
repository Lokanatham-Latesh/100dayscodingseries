import java.util.Arrays;

public class Lokanathamlatesh_day50{
  public static void main(String[] args) {
    int arr[] = {4,1,2,3};
    int sum = 0;
    Arrays.sort(arr);
    for(int i = 0;i<arr.length;i++){
        sum += (arr[i]*arr[i]);
    }

    System.out.print("Sum of positive square "+sum);
  }  
}
