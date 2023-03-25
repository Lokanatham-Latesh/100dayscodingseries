import java.util.Scanner;
public class Lokanathamlatesh_day15{
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum  = 0;
        if(num>0){
            while(num>0){
                int lastdigit = num%10;
                sum += factorial(lastdigit);
                num/= 10;
            } 
        }
        else{
            System.out.println("Invalid input");
        }
        if(temp == sum){
            System.out.println(" Strong number");
        }
        else{
            System.out.println("Not a Strong number");
        }
        sc.close();
    } 

public static int factorial(int num) {
    int fact = 1;
    
    for(int i = 1;i<=num;i++){
        fact *=i;
    }
    return fact;
}
}