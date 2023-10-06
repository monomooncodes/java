import java.util.Scanner;

public class areaofcircle{
 
 public static void main (String[] args){
// making oject
 Scanner s = new Scanner(System.in);
System.out.println("enter ratious");
double r= s.nextDouble();
double area=(22*r*r)/7;
System.out.println("your area of circle is" + area);
 }

}