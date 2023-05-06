import java.util.*;
public class Lokanathamlatesh_day61{
  public static void main(String[] args) {
    System.out.println("Enter the number of testcase");
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int arr[]= new int[t];
    for(int i = 0;i<t;i++){
       System.out.println("Enter a and b value");
       int a = sc.nextInt();
       int b = sc.nextInt();
       arr[i] = a+b;}
    for(int i = 0;i<arr.length;i++){
        if(arr[i]<3){
            System.out.println("1");}
        else if(arr[i]>=3 && arr[i]<=10){
            System.out.println("2");}
        else if(arr[i]>=11 && arr[i]<=60){
            System.out.println("3");}
        else{
            System.out.println("4");
        }}
  }  
}
