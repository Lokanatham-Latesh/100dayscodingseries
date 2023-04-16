import java.util.Scanner;
public class Lokanathamlatesh_day44{
    public static void main(String[] args) {
       System.out.println("Enter the Array size");
       Scanner sc  = new Scanner(System.in);
       int size = sc.nextInt();
       int even = 0;
       int odd = 0;
       int arr[] = new int[size];
       for(int i = 0;i<size;i++){
        System.out.print("Enter "+i+"th element of array  ");
        arr[i]= sc.nextInt();
        if(arr[i]%2 == 0){
            even++;}
        else{
            odd++;
        }}
       System.out.println("Number of even elements in array  "+even);
       System.out.println("Number of odd elements in array  "+odd);
       sc.close();
       return;
    }
}
