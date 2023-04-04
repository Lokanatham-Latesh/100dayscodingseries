import java.util.Scanner;
public class Lokanathamlatesh_day33{
    public static void main(String[] args) {
        System.out.println("Enter the String to check for palindrome");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        for(int i= str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        if(str.equals(str1)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
