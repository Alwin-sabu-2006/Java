package javaprgm;
class Book
{
	String title;
	String author;
	final int book_id;
	final static String Library_name="Sjcet";
	static int book_counter=1000;
	int book_count=0;
	
	Book()
	{
		title="No title";
		author="No Author";
	    book_id=book_counter;
	    book_counter++;
	}
	Book(String title,String author){
		this.title=title;
		this.author=author;
		book_id=book_counter;
	    book_counter++;
	}
	public void displayInfo(String author)
	{
		System.out.println("Title:"+this.title);
		System.out.println("Author:"+this.author);
		
	}
	public void displayInfo(boolean showlibrary)
	{
		if(showlibrary)
		{
			displayInfo( );
			System.out.println("Library name:"+Library_name);
			
		}
		
	}
	public void display_total_books()
	{
		System.out.println("Total books:"+book_count);
	}
}

public class Book_Final {
	public static void main(String args[])
	{
		Book bk=new Book();
		bk.displayInfo("Wing of fire","APJ");
		
		
	}

}
