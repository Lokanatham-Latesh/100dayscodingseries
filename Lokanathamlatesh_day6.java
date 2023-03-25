import java.util.Scanner;
public class Lokanathamlatesh_day6{
     public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of x coordinates");
    int x = sc.nextInt();
    System.out.println("Enter the value of y coordinates");
    int y = sc.nextInt();

    System.out.println(" This Point lies in ");
  if(x>0 && y>0){
    System.out.println("First quadrant");
  }
  else if(x<0 && y>0){
    System.out.println("Second quadrant");
  }
  else if(x<0 && y<0){
    System.out.println("Third quadrant ");
  }
  else if(x>0 && y<0){
    System.out.println("Fourth quadrant");
  }
  else{
    System.out.println("On the origin  WOW");
  }
     }

}
