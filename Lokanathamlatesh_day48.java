import java.util.*;
public class Lokanathamlatesh_day48{
 public static void main(String[] args) {
    System.out.println("Enter the size of array");
    Scanner sc = new Scanner(System.in);
    int size =  sc.nextInt();
    int arr[] = new int[size];
    int temp[] = new int [size];
    int inc  = 0;
    for(int i = 0;i<size;i++){
        System.out.println("Enter "+i+" th element of array ");
        arr[i]  = sc.nextInt();
    }
    Arrays.sort(arr);

    for(int i = 0;i<size-1;i++){
     if(arr[i]!= arr[i+1]){
        temp[inc++]= arr[i];
     }
       
    }
    temp[inc++]  = arr[arr.length-1];
             System.out.println("After removing duplicates Arrays looks like");
    for(int i = 0;i<temp.length;i++){
        if(temp[i]!= 0)
        System.out.print(temp[i]+" ");
    }

 }   
}
