import java.util.*;
import java.lang.*;
public class Lokanathamlatesh_day36 {

    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(0);
        String str2 = "";
            str2+= Character.toUpperCase(ch);
            str2 += str.substring(1,str.length()-1);
          char ch1 = str.charAt(str.length()-1);
          str2+=Character.toUpperCase(ch1);
          System.out.println("Resultant  String  "+str2);
    }

}
