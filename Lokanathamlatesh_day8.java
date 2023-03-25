import java.util.Scanner;
public class Lokanathamlatesh_day8{
     public static void main(String[] args) {
  
    System.out.println("enter the value of a ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("enter the value of b ");
    int b = sc.nextInt();
    System.out.println("enter the value of c ");
    int c = sc.nextInt();
     double discriminant =  b*b- 4*a*c;

       double root1;
       double root2;     
     if(discriminant>0){
       root1 = (-b-Math.sqrt(discriminant))/(2*a);
       root2 = (-b+ Math.sqrt(discriminant))/(2*a);
       System.out.println("roots are real and unequal");
       System.out.println(root1);
       System.out.println(root2);
     }
     else if(discriminant<0){
        System.out.println("roots are real and imaginary");
        System.out.println("root1 = "+(-b/ (2*a))+"+"+(float)Math.sqrt(discriminant)+"i");
        System.out.print("root2 = "+(-b/(2*a))+"-"+(float)Math.sqrt(discriminant)+"i");
     }
     else{
       root2 =  root1 = (-b/(2*a));
       System.out.println("roots are real and equal");
       System.out.println(root1 +"="+root2);
        
     }

 }

}
