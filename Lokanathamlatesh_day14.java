import java.util.Scanner;
public class Lokanathamlatesh_day14{
    public static void main(String[] args) {
   System.out.println("Enter the number to reverse");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int temp = num;
    int reverse = 0;
     if(num>0){
        while(temp>0){
            int rem = temp%10;
            reverse = reverse*10+rem;
            temp = temp/10; }
        System.out.println("reverse of number "+num+" = "+ reverse);
     }else{
            num = Math.abs(num);
            while(num>0){
                int rem = num%10;
                reverse = reverse*10+rem;
                num = num/10;}
            System.out.println("reverse of negative number "+reverse+"-");
        }}}
    

