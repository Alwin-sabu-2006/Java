package jarvis;
class Student {
    String name;
    int rollno;
    int m1;
    int m2;
    int m3;
    float avg;
    Student(int rollno,String name,int m1,int m2,int m3)
    {
    	this.name=name;
    	this.rollno=rollno;
    	this.m1=m1;
    	this.m2=m2;
    	this.m3=m3;
 }
    public void CalculateAverage()
    {
    	 avg=(m1+m2+m3)/3;
    }
    public void Displayinfo()
    {
    	System.out.println("Name is:"+name);
    	System.out.println("Rollno is:"+rollno);
    	System.out.println("Average mark  is:"+avg);
    }
}
public class Student_Constructor
{
	public static void main(String[] args)
	{
		Student std=new Student(1,"Abhijith",98,99,97);
		std.CalculateAverage();
		std.Displayinfo();
		Student std1=new Student(2,"Abhilash",98,99,97);
		std1.CalculateAverage();
		std1.Displayinfo();
		
		
		
	}
}
   
