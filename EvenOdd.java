package first_java;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[]args)
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int number =sc.nextInt();
      if(number%2==0)
      {
    	  System.out.println("The given nuber is even");
    	  
	} 
      else
      {
    	  System.out.println("THe given number is odd");
      }
}
}