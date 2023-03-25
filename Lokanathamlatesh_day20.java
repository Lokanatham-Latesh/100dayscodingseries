import java.util.Scanner;
public class Lokanathamlatesh_day20 {
    public static boolean isprime(int num){
        if(num ==1 || num == 0){
            return false;}
        if(num == 2){
            return true;}
        for(int i = 2;i<num;i++){
         if(num%i == 0){
            return false;
         }}
        return true;}
    public static void main(String[] args) {
        System.out.println("Enter the number to check whether it is prime or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = isprime(num);
        if(result == true){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a Prime number");
        }}}
    

