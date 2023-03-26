import java.util.Scanner;
public class Lokanathamlatesh_day24{
    
public static void main(String[] args) {
System.out.println("Enter number of rows to print Pyramid");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt(); 
for(int i = 0;i<=n;i++){
    for(int j= 0;j<i;j++){
        System.out.print("*"+" ");
    }
    System.out.println();
}

}

}
