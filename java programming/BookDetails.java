package assignment3;
import java.util.Scanner;
class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
class EngineeringBook extends Book
{

	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	}

public class BookDetails {

	public static void main(String[] args) {
		Book b=new Book();
		EngineeringBook e=new EngineeringBook();
		System.out.println("enter the bookNo ,title ,author ,price ,category :");
		Scanner s=new Scanner(System.in);
	
		 b.setBookNo(s.nextInt());
		 b.setTitle(s.next());
		 b.setAuthor(s.next());
		 b.setPrice(s.nextFloat());
		 e.setCategory(s.next());
			 
		  System.out.println(b.getBookNo());
		  System.out.println(b.getTitle());
		  System.out.println(b.getAuthor()); 
		  System.out.println(b.getPrice());
		  System.out.println(e.getCategory());		 		  
	}
}
