public class Lokanathamlatesh_day51{
 public static void main(String[] args) {
    int arr[] = {4,2,8,10,3};
    System.out.println("Before sorting Array looks like : ");
    for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    for(int i= 0;i<arr.length;i++){
        for(int j = 0;j<arr.length-1;j++){
            if(arr[j] > arr[j+1]){
              int temp = arr[j];
              arr[j]= arr[j+1];
              arr[j+1] = temp;
            }
        }
    }
    System.out.println();
    System.out.println("After sorting Array looks like : ");
    for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
 }   
}
