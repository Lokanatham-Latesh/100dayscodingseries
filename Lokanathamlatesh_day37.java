import java.util.Scanner;
public class Lokanathamlatesh_day37{
  public static void main(String[] args) {
    System.out.print("Enter the String ");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char  ch[] = str.toCharArray();
    int feq[] = new int[str.length()];
     for(int i = 0;i<str.length();i++){
        feq[i]= 1;
        for(int j = i+1;j<str.length();j++){
            if(ch[i]== ch[j]){
                feq[i]++;
                ch[j]= '%';
            }
            
        }
     }
     for(int i = 0;i<feq.length;i++){
        if(ch[i]!= ' ' && ch[i] != '%'){
            System.out.println("Frequency of  "+ ch[i]+"  is "+feq[i]);
        }
     }
  }  
}
