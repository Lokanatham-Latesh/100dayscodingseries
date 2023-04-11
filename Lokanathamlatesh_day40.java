import java.util.*;
public class Lokanathamlatesh_day40 {
   public static void main(String[] args) {
    System.out.println("Enter the String");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println("Enter the substring to be removed :");
    String str2 = sc.nextLine();
    System.out.println("Enter new the substring to be add :");
    String str3 = sc.nextLine();
    String result = str.replace(str2, str3);
  System.out.println(result);}}

    

