import java.util.Scanner;
public class Lokanathamlatesh_day45{
   public static void main(String[] args) {
    System.out.println("Enter the Array size");
    Scanner sc  = new Scanner(System.in);
    int size = sc.nextInt();
    int even = 0;
    int odd = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int arr[] = new int[size];
    for(int i = 0;i<size;i++){
     System.out.print("Enter "+i+"th element of array  ");
     arr[i]= sc.nextInt();
       if(max<arr[i]){
        max = arr[i];
       }
       if(min>arr[i]){
        min = arr[i];
       }}
    System.out.print("MAXIMUM number in array is "+max+"\n");
    System.out.print("MINIMUM number in array is "+min+"\n");
    
}
}
