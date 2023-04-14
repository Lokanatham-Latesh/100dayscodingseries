import java.util.*;
public class Lokanathamlatesh_day43{
    public static void main(String[] args) {
        System.out.print("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
       String even = "";
       String odd = "";
        for(int i = 0;i<size;i++){
            System.out.print("enter "+i+"th element array ");
            arr[i] = sc.nextInt();

        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                odd = "ODD";
                
                
            }
            else{
                even = "EVEN";
                if(odd.equals("ODD")){
                    System.out.println("Mixed");
                    return;
                }
            }
        }
   
  if(even.equals("")){
        System.out.print(odd);
    }
    else{
        System.out.print(even);
    }


    }
}
