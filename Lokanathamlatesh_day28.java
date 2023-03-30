import java.util.*;
public class Lokanathamlatesh_day28{
    public static void main(String[] args) {
        System.out.println("Enter the String to Reverse");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp = " ";
        for(int i = str.length()-1;i>=0;i--){
             temp += str.charAt(i);
        }
        System.out.println("After Reversing String looks like    " +temp);
    }


}
