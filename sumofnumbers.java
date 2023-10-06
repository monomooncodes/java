import java.util.Scanner;

public class sumofnummbers{
    public static void main(String[]args){

        Scanner s = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=s.nextInt();
        System.out.println("enter the second number");
        int num2=s.nextInt();

      int sum=num1+num2;

      System.out.println("the sum is"+sum);


    }
}