package first_java;

import java.util.Scanner;

public class Prime {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number:");
		int number=sc.nextInt();
		boolean flag=true;
		if (number < 2) {
	            System.out.println("Not Prime");
	            return;
	        }
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				  flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println("It is prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
