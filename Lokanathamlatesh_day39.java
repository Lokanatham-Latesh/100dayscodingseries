
import java.util.*;

public class Lokanathamlatesh_day39{
public static void main(String[] args) {
    System.out.print("Enter the string  ");
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    System.out.print("Enter another string  ");
    String str2 = sc.nextLine();
   str1.toUpperCase();
   str2.toUpperCase();
   if(str1.length()== str2.length()){
    char ch[]= str1.toCharArray();
    char ch1[]= str1.toCharArray();
    Arrays.sort(ch);
    Arrays.sort(ch1);
    boolean result = Arrays.equals(ch,ch1);
    if(result == true){
        System.out.print(" Anagram");
    }
    else{
        System.out.print(" Not an  Anagram");  
    }
   }
   else{
      System.out.print("Not an Anagram");
   }


}
}
