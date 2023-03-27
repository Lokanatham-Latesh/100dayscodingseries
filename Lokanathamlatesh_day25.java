import java .util.Scanner;
public class Lokanathamlatesh_day25{
    public static void main(String[] args) {
       System.out.println("Enter the radius of the circle");
       Scanner sc = new Scanner(System.in);
       double radius = sc.nextDouble();
      Circle c1 = new Circle();
       System.out.println("Area of circle is  = "+c1.Areaofcircle(radius));  
    }
}
class Circle{
 double pi = 3.14;
     double Areaofcircle( double radius){
        double area = pi * radius*radius;

        return area;
     }

}