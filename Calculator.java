/* Simple java Program to perform Basic Calculator operation*/
import java.util.Scanner;

public class Calculator{
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number 1 : ");
       int a = sc.nextInt();
       System.out.print("Enter Number 2 : "); 
       int b = sc.nextInt();

       System.out.println("Addition is : " + (a+b));
       System.out.println("Subtraction is : " + (a-b));
       System.out.println("Multiplication is : "+ (a*b));
       System.out.println("Division is : "+ (a/b));
    }
}
public class Calculator{
  
