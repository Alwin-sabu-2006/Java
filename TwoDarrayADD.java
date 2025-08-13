import java.util.Scanner;
public class TwoDarrayADD {
	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the no of rows in first matrix:");
	    int row1=sc.nextInt();
	    System.out.println("Enter the no of columns in first matrix:");
	    int col1=sc.nextInt();
	    System.out.println("Enter the no of rows in second matrix :");
	    int row2=sc.nextInt();
	    System.out.println("Enter the no of columns in second matrix:");
	    int col2=sc.nextInt();
	    if(row1==row2 && col1==col2)
	    {
	    int arr[][]= new int[row1][col1];
	    
		for(int i=0;i<row1;i++)
		{   
			
			for(int j=0;j<col1;j++)
		
			{
			System.out.println("Enter the  Elements:");
			arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("First matrix:\n");
		 for(int i=0;i<arr.length;i++)
	  	   {
	  		   for(int j=0;j<arr[i].length;j++)
	  		   {
	  			   System.out.print(arr[i][j]+"\t");
	  		   }
	  		   System.out.println();
	  	   }
	  	  
	    
	    int arra[][]= new int[row2][col2];
	    

		for(int i=0;i<row1;i++)
		{   
			
			for(int j=0;j<col1;j++)
		
			{
			System.out.println("Enter the  Elements:");
			arra[i][j]=sc.nextInt();
			}
		}
		System.out.println("Second matrix:\n");
		 for(int i=0;i<arra.length;i++)
	  	   {
	  		   for(int j=0;j<arra[i].length;j++)
	  		   {
	  			   System.out.print(arra[i][j]+"\t");
	  		   }
	  		   System.out.println();
	  	   }
		int result[][]= new int [row2][col2];
		for(int i=0;i<row2;i++)
		{   
			
			for(int j=0;j<col2;j++)
		
			{
			 result[i][j]=arr[i][j]+arra[i][j];
			}
		}
		 System.out.println("Resultant matrix:\n");

		 for(int i=0;i<result.length;i++)
  	   {
  		   for(int j=0;j<result[i].length;j++)
  		   {
  			   System.out.print(result[i][j]+"\t");
  		   }
  		   System.out.println();
  	   }
  	  
		
		
}
	    else
	    {
	    	System.out.println("Addition is not possible");
	    }
}
}
