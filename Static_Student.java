package javaprgm;
class Stud
{
	String name;
	static int  std_count=0;
    Stud(String name)
    {
     this.name=name;
    }
    public static int  getStudentCount()
    {
    	 return std_count=std_count+1;
    }
    public void Student_details()
    {
    	System.out.println("Name:"+this.name);
    }
}

public class Std {
	public static void main(String[] args)
	{
		Stud st =new Stud("ALwin");
		st.Student_details();
		Stud.getStudentCount();
		Stud st1 =new Stud("Manu");
		st1.Student_details();
		Stud.getStudentCount();
		Stud st2 =new Stud("Alex");
		st2.Student_details();
		System.out.println("Student_count="+Stud.getStudentCount());
		
	}

}
