package libraryManagementSystem;

import java.time.LocalDate;

public class Book implements Comparable<Book>{
	
	private String title;
	private int bookid;
	private String authorName;
	private LocalDate issueingDate;
	private Category booktype;
	private int quantity;
	
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", bookid=" + bookid + ", authorName=" + authorName + ", issueingDate="
				+ issueingDate + ", booktype=" + booktype + "]\n";
		
		
	}


	public String getTitle() {
		return title;
	}


	public int getBookid() {
		return bookid;
	}


	public String getAuthorName() {
		return authorName;
	}


	public LocalDate getIssueingDate() {
		return issueingDate;
	}


	public Category getBooktype() {
		return booktype;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public void setIssueingDate(LocalDate issueingDate) {
		this.issueingDate = issueingDate;
	}


	public void setBooktype(Category booktype) {
		this.booktype = booktype;
	}


	public Book(String title, int bookid, String authorName, LocalDate issueingDate, Category booktype, int quantity) {
		super();
		this.title = title;
		this.bookid = bookid;
		this.authorName = authorName;
		this.issueingDate = issueingDate;
		this.booktype = booktype;
		this.quantity=quantity;
	}


	@Override
	public int compareTo(Book o) {
		
		System.out.println("Into comparable class");
		return this.getAuthorName().compareTo(o.getAuthorName());
	}
	
	
	
	
	
	
	

}
