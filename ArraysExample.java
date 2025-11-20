import java.util.Scanner;
public class Arrayex {
    public static void main(String[] args)
    {
        int []anarray=new int[100];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the elements:");
            int b=sc.nextInt();
            anarray[i]=b;
        }
        System.out.println("Enter the element to be searched");
        int nu=sc.nextInt();
        int j;
        for(j=0;j<n;j++)
        {
            if(anarray[j]==nu)
            {
                System.out.println("Element Found");
            }
        }
    }
}
