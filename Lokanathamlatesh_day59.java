import java.util.*;
public class Lokanathamlatesh_day59{
  public static void main(String[] args) {
    System.out.println("Enter The Number of TestCase");
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int i =0 ;i<T;i++){
        System.out.println("Enter The Mass of Person In KG");
        int M = sc.nextInt();
        System.out.println("Enter The Height of Person In  Meters ");
        int H = sc.nextInt();
        int BMI = M/(H*H);
        if(BMI<=18){
            System.out.println(" Underweight  1");
        }
        else if(BMI>=19 && BMI<=24){
            System.out.println("Normal weight  2");
        }
        else if(BMI>=25 && BMI<=29){
            System.out.println("OVER WEIGHT 3");
        }   
        else{
            System.out.println("OBESITY   4");
        }
    }
    }
  }  

