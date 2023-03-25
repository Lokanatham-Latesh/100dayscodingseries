import java.util.Scanner;
public class Lokanathamlatesh_day2{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the character");
  char k = sc.next().charAt(0);
 if (k>='A' && k <='Z'){
  System.out.println(" you entered a alphabet");
}
else if( k>='a' && k<='z'){
System.out.println(" you entered a alphabet");
}
else
{
System.out.println(" Not a alphabet");
}
}
}
