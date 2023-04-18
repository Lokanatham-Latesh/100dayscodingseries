import java.util.*;
public class Lokanathamlatesh_day46{
  public static void main(String[] args) {
    System.out.println("Enter the size of array");
    Scanner sc = new Scanner(System.in);
    int size =  sc.nextInt();
    int sum = 0;
    int arr[] = new int[size];
    for(int i = 0;i<size;i++){
        System.out.println("Enter "+i+" th element of array ");
        arr[i]  = sc.nextInt();
        sum+= arr[i];}
    System.out.print("The sum of Elements of Array " +sum);
  }  
}
