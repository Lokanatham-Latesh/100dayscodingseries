import java.util.Scanner;
public class Lokanathamlatesh_day32{
    public static void main(String[] args) {
      System.out.println("Enter the String");
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String str1 = "";
         for(char ch : str.toCharArray()){ 
            if(ch == 'i'|| ch == 'a'||ch == 'e'||ch == 'o'||ch == 'u' ){
                
            }
            else if(ch == 'I'|| ch == 'A'||ch == 'O'||ch == 'E'||ch == 'U'){
            }
            else{
                str1= str1+ch;
            }
         }
         System.out.println("After removing vowels in String  "+str1); 
    }
}
