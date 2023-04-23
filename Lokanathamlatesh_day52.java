
public class Lokanathamlatesh_day52{
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    System.out.print("Before reverse Arrays Looks like \n");
    for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i]+" ");}
    int temp[] = new int[arr.length];
    int count = 0;
     for(int i = arr.length-1;i>=0;i--){
        temp[count] =arr[i];
        count++;}
     System.out.println();
     System.out.print("After reverse Arrays Looks like \n");
    for(int i = 0;i<arr.length;i++){
        System.out.print(temp[i]+" ");
    }}}
