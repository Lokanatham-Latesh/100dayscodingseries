import java.util.Scanner;
public class Lokanathamlatesh_day9{
    
public static void main(String[] args) {
    System.out.println("Enter the number");
   Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   int count = 0;
if(num >0){
   while(num>0){
    num = num/10;
    count++;
   }
}
// it works for if user enters number = 0 or any negative n
else{
count++;

   System.out.println("Number of digits in given number because u entered 0 or any negative = "+count);

}

}
}
