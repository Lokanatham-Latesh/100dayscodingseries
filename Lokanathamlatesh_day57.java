import java.util.*;
public class Lokanathamlatesh_day57{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Testcase");
    int t = sc.nextInt();
    int x = 0;
    int p = 0;
    int n  = 0;
    for(int i = 0;i<t;i++){
     System.out.println("Enter the Number questions");
      n  = sc.nextInt();
      System.out.println("Enter the How many number of question are correct");
       x =  sc.nextInt();
       System.out.println("Enter How many marks to get pass");
       p = sc.nextInt();
       int marks = x*3;
      int notatt = n-x;
      marks -= notatt;
   if(marks>=p){
    System.out.println("PASS");}
   else{
    System.out.println("FAIL");
   }}}}
    
