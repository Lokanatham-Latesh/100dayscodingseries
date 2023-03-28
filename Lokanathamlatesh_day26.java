import java.util.*;
public class Lokanathamlatesh_day26{
    public static void main(String[] args) {
        System.out.println("Enter the number of People in the room");
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=num;i++){
            int eachperson = num-i;
             sum += eachperson;
        }
        System.out.println("Number of handshakes possible with "+ num+" numbers = "+ sum);
    }
}
