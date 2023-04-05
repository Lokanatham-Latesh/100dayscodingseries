import java.util.*;
import java.lang.*;
public class Lokanathamlatesh_day34{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Expression to remove brackets");
    String str = sc.nextLine();
    String str2 = "";
       for(char ch : str.toCharArray()){
            if(ch== ')'||ch== '('|| ch == ']'||ch== '['){
               
            }
            else if(ch=='}'||ch=='{'){
               
            }
            else{
                str2+=ch; 
            }
       }
       System.out.println("After removing brackets"+str2);

  }  
}
