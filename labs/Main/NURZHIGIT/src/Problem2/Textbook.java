package Problem2;
import java.io.Serializable;

public class Textbook implements Serializable{
	private String isbn, title, author;
	
	public Textbook(String isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		if(!(object instanceof Textbook)) {
			return false;
		}
		Textbook tb = (Textbook) object;
		return tb.isbn.equals(isbn) && tb.title.equals(title) && tb.author.equals(author);
	}
	
	public String toString() {
		return  "isbn: " + isbn + ", title: " + title + ", author: " + author; 
	}
	
	public int hashCode() {
		int result = 97;
		result += (result*isbn.length()) % 7;
		return result;
	}
}
