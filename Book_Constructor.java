package javasimple;


class Book {
    String title;
    String author;
    double price;
    int qty;
    double total;
    
    Book(String title,String author,double price,int qty)
    {
    	this.title=title;
    	this.author=author;
    	this.price=price;
    	this.qty=qty;

 }
    public void Total()
    {
    	 total=price*qty;
    }
    public void Displayinfo()
    {
    	System.out.println("\nThe title of book is:"+title);
    	System.out.println("The author of the book  is:"+author);
    	System.out.println(" Price is:"+price);
    	System.out.println(" Qty is:"+qty);
    	System.out.println("The total value is:"+total);
    }
}
public class Book_Constructor
{
	public static void main(String[] args)
	{
	    Book bk=new Book("Wings of Fire","APJ ABDUL KALAM",500.00,2);
		bk.Total();
		bk.Displayinfo();
		Book bk1=new Book("The Goat Life","Benyamin",250.00,2);
		bk1.Total();
		bk1.Displayinfo();
		
		
		
	}
}
   

