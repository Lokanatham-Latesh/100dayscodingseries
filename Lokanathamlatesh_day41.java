import java.util.Scanner;
public class Lokanathamlatesh_day41{
    public static void main(String[] args) {
       System.out.println("enter the String");
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       System.out.println("enter the Another String");
       String str2 = sc.nextLine();
       if(str.length() == str2.length()){
            for(int i=0;i<str.length();i++){
              if(str.charAt(i)=='*' && str.charAt(i+1)== '?'){
                 String sub = str.substring(0,i);
                 String sub1 = str2.substring(0,i);
                 String sub3 = str.substring(i+1,str.length());
                 String sub4 = str.substring(i+1,str.length());
                 if(sub.equals(sub1)&& sub3.equals(sub4)){
                    System.out.println("Yes matches");
                    return;
                 }
                 else{
                    System.out.println("Not matches");
                    return;
                 }
              }


            }    
        }
        else{
            System.out.println("Not matches"); 
        }
        

    }
}
