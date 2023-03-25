import java.util.Scanner;
public class Lokanathamlatesh_day16{
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int sum = 0;
        if(num>0){
            for(int i = 1;i<num;i++){
                if(num%i==0){
                    sum+=i;
                }
            }
        }
        else{
            System.out.println("Invalid input");
        }
        if(sum == num){
            System.out.println("perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}
