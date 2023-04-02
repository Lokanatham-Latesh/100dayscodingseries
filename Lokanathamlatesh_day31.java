import java.util.Scanner;
public class Lokanathamlatesh_day31{
    public static void main(String[] args) {
       System.out.println("Enter the String ");
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       String str1 = "";
        for(int i = 0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))
            {
            str1 += Character.toLowerCase(str.charAt(i));}
            else{
            str1 += Character.toUpperCase(str.charAt(i));
            } }
        System.out.println(" Toggle of String is  " + str1);
        }
    }

