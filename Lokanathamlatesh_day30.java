import java.util.Scanner;
public class Lokanathamlatesh_day30 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Strings ");
     String str = sc.nextLine();
     int count = 0;
     for(char c : str.toCharArray()){
        count++;
     }
     
     System.out.println("Length of the String is " +count); 

  }
}
