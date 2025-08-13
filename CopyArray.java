import java.util.Scanner;
public class CopyArray {
	
	
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
			int [] arr=new int[n];
			for(int j=0;j<n;j++)
			{   
				arr[j]=array[j];
				
			}
			System.out.println("Copying elements from array to arr:");
			for(int num:arr)
			{
				System.out.println(num+"\t");
			}
			System.out.println("\nThe no of elements in the array is"+arr.length);
			
		
	}
}
