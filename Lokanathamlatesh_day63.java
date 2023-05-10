import java.util.*;
public class Lokanathamlatesh_day63{
 public static void main(String[] args) {
    System.out.println("Enter The number of testcase");
    Scanner sc = new Scanner(System.in);
    int  t =  sc.nextInt();
    int arr[]= new int[t];
    for(int i= 0;i<t;i++){
        System.out.println("Enter The for each testcase ");
       int w1 = sc.nextInt();
       int w2 = sc.nextInt();
       int x1 = sc.nextInt();
       int x2 = sc.nextInt();
       int  M = sc.nextInt();
       if(w2>w1){
      int res =  w2-w1;
         if((res) >=(x1*M) && (res)<(x2*M)){
            arr[i] = 1;
         }
         else{
            arr[i] = 0;
         }
       }
      
    }
    for(int i = 0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
 }   
}
