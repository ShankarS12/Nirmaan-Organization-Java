package day22;

public class Book {
	
	private int id;
	private String bookName;
	private String author;
	private double price;
	private int noOfCopies;
	
	public Book() {
		
	}
	
	public Book(String bookName, String author, double price, int noOfCopies , int id) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.noOfCopies = noOfCopies;
		this.id = id;
	}

	public Book(String bookName, String author, double price, int noOfCopies ) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.noOfCopies = noOfCopies;
	}
	
	public int getId() {
		return id;
	}
	
	void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", price=" + price + ", noOfCopies=" + noOfCopies
				+ "]";
	}
	
	
	
	
	

}
