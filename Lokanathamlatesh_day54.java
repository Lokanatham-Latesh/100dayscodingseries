public class Lokanathamlatesh_day54{
    public static void main(String[] args) {
        int arr[] = {3,5,12,78,6};
        int arr1[] = {6,7,34,1,10,60};
        int result = 0;
        if(arr.length<=arr1.length){
            result = arr.length;
        }
        else{
            result = arr1.length;
        }
        String  res = "DisJoint";
  for(int i = 0;i<result;i++){
    int key = arr[i];
    for(int j = 0;j<result-1;j++){
        if(key == arr1[j]){
           System.out.println("Not Disjoint");
           return;
        }
    }
  }
    System.out.println(res);
     }
}
