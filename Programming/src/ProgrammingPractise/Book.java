package ProgrammingPractise;

public class Book implements Comparable<Book> {
	int id;
	String name,author,publisher;
	int quantity;
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	/*public int compareTo(Book b)
	{
		if(this.id<b.id) {
			return 1;
		}
		else if(this.id>b.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
		}*/
	public int compareTo(Book b)
	{
		if(this.name.compareTo(b.name)>1)
		{
			return 1;
		}
		else if(this.name.compareTo(b.name)==0)
		{
			return 0;
		}
		else
		{
			return -1;
		}
	
	
	
	
	
	}
	

}
