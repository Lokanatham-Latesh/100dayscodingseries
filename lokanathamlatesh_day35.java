import java.util.*;
public class Lokanathamlatesh_day35{
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        String str1 = "";
        int i = 0;
        for(char ch : str.toCharArray()){
            if(ch>='1'&& ch<='9'){
                str1+= (ch);
                 i = Integer.parseInt(str1);
            }
        }
        while(i>0){
            int rem = i%10;
            sum+=rem;
            i/=10;
        }
        System.out.println("Sum of digit in string "+sum);
    }
}
