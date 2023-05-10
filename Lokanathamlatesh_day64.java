import java.util.*;
public class Lokanathamlatesh_day64{
   public static void main(String[] args) {
    System.out.println("Enter the number of testcase");
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    
    for(int i = 0;i<t;i++){
        String str = sc.next();
        char ch[] = str.toCharArray();
        boolean res = false;
        for(int j = 0;j<ch.length-2;j++){
      if((ch[j] == '0'  && ch[j+1] == '1' && ch[j+2] == '0') || ch[j] == '1' && ch[j+1]== '0' && ch[j+2]== '1' ){
          res = true;
          break;
      }
        }
        if(res == true){
            System.out.println("GOOD");
          }
          else{
            System.out.println("BAD");
          }
        
        
    }
   } 
}
