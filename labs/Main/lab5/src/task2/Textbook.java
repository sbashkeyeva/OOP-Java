package task2;
import java.io.Serializable;

public class Textbook implements Serializable {
	String isbn;
	String title;
	String author;
	public Textbook()
	{
		isbn="";
		title="";
		author="";
	}
	public Textbook(String isbn,String title,String author)
	{
		this.isbn=isbn;
		this.title=title;
		this.author=author;
	}
	String getIsbn()
	{
		return isbn;
	}
	String getTitle()
	{
		return title;
	}
	String getAuthor()
	{
		return author;
	}
	void setIsbn(String isbn)
	{
		this.isbn=isbn;
	}
	void setTitle(String title)
	{
		this.title=title;
	}
	void setAuthor(String author)
	{
		this.author=author;
	}
	public boolean equals(Object o)
	{
		if(this.getClass()!=o.getClass() || o==null) return false;
		Textbook t=(Textbook)o;
		if(!(t.isbn.equals(isbn))) return false;
		return true;
	}
	public String toString()
	{
		return isbn+" "+title+" "+author;
	}
	
}
