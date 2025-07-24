import java.util.Scanner;
public class StudentMethodClass {
    String name;
    int rollno;

    void displaydetails( )
    {
        System.out.println("Student Name:"+name);
        System.out.println("Rollno:"+rollno);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        StudentMethodClass std=new StudentMethodClass();
        System.out.println("Enter the name:");
        std.name=sc.nextLine();
        System.out.println("Enter Rollno:");
        std.rollno=sc.nextInt();
        std.displaydetails();




    }
}
