package javasimple;
class Mathsop{
	public int area(int side)
	{
		System.out.println("The area of square is:");
		return side*side;
	}
	public int area(int l,int b)
	{
		System.out.println("The area of rectangle is:");
		return l*b;
	}
	public float area(float radius)
	{
		System.out.println("The area of circle is:");
		return 3.14f*radius*radius;
	}
	public float area(float height,float radius)
	{
		System.out.println("The area of cylinder is:");
		return 3.14f*height*radius*radius;
	}
}

public class MethodOverloading {
	public static void main(String[] args)
	{
		Mathsop mt=new Mathsop();
		System.out.println(mt.area(8));
		System.out.println(mt.area(8,8));
		System.out.println(mt.area(8f));
		System.out.println(mt.area(8f,8f));
		
	}
	      
}
