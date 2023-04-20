
import java.util.Arrays;
public class Lokanathamlatesh_day49{
    public static void main(String[] args) {
         int arr[] = {1,2,3,4};
         int arr2[]= {5,8,7,6} ;
         Arrays.sort(arr);
         int mindotproduct  = 0;
         // descinding order
        for(int i = 0;i<arr2.length;i++){
            for(int j = 0;j<arr2.length-1;j++){
                if(arr2[j] <arr2[j+1] ){
                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1]= temp;}}}    
        for(int i = 0 ;i<arr2.length;i++){
         mindotproduct += arr[i]*arr2[i];    
        }
         System.out.print(mindotproduct);
    }

}
