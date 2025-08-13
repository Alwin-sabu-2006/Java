import java.util.Scanner;
public class Array {
	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the no of Elements:");
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{   
			System.out.println("Enter the  Elements:");
			array[i]=sc.nextInt();
			
		}
		System.out.println("Displaying Elements:");
		for(int num:array)
		{
			System.out.println(num+"\t");
		}
		System.out.println("\nThe no of elements in the array is"+array.length);
		
	}
}