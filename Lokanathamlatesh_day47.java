import java.util.*;
public class Lokanathamlatesh_day47{
public static void main(String[] args) {
    System.out.println("Enter the size of array");
    Scanner sc = new Scanner(System.in);
    int size =  sc.nextInt();
    int arr[] = new int[size];
    int min = 0;
    int highest = 0;
    for(int i = 0;i<size;i++){
        System.out.println("Enter "+i+" th element of array ");
        arr[i]  = sc.nextInt();
      int result  = isplaindrome(arr[i]);
       if(min< result){
        min = result;
        highest = arr[i];
       
       }
    }
    System.out.println("The highest palindrome in array is  "+highest);
}
static int isplaindrome(int num){
    int sum = 0;
    int count = 0;
    int max = 0;
    int temp = num;
   while(num>0){
    int rem = num%10;
    sum = (sum*10)+(rem);
    num = num/10;
    count++;

   }
   if(temp ==  sum){
    return count;
   }
   return 0;
}
}