package bookstore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	@Id
	private int bookCode;
	private String bookTitle;
	private String author;
	private String subject;
	private int price;
	
	public Book() {
		super();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public Book(int bookCode, String bookTitle, String author, String subject, int price) {
		super();
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.author = author;
		this.subject = subject;
		this.price = price;
	}
	
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
