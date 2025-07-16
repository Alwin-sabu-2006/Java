package first_java;

import java.util.Scanner;

public class Firstn_Numbers {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number:");
		int number=sc.nextInt();
		for(int i=0;i<=number;i++)
		{
			System.out.println(i);
		}
		
	}


}
