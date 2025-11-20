class Area{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(int a, int b,int c)
    {
        System.out.println(a+b+c);
    }
}
public class MOE {
    public static void main(String[] args)
    {
        Area a =new Area();
        a.add(1,2,3);
        a.add(2,3);
    }
}
