import java.util.Scanner;
public class Lokanathamlatesh_day1{
    public static void main(String args[]){

      Scanner sc = new Scanner(System.in);
          System.out.println("enter the character you want check for vowel or consonat");
             System.out.println("it will work for both uppercase and lowercase");
          char var = sc.next().charAt(0);
           if(var == 'a'|| var == 'A'|| var == 'e'|| var == 'E'|| var == 'i'|| var == 'I'|| var == 'o'|| var == 'O' || var == 'u'|| var == 'U'){
            System.out.println("vowel");
           }
           else{
            System.out.println("consonant");
           }
    }
}
