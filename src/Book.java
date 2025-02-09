
public class Book {
	private String title;
	
	private String author;
	
	private String ISBN;
	
	private double price;

	/**
	 * Creates a Book object using the items: title, author, ISBN, and price.
	 * 
	 * @param title
	 * @param author
	 * @param ISBN
	 * @param price
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}

	/**
	 * Creates a Book objects without any parameters.
	 * 
	 * Sets title, author, and ISBN to "Unknown"<br>
	 * Sets price to 0.0
	 */
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	/**
	 * Creates a copy of a given Book object.
	 * 
	 * @param u - a Book object
	 */
	public Book(Book u) {
		this.title = u.getTitle();
		this.author = u.getAuthor();
		this.ISBN = u.getISBN();
		this.price = u.getPrice();
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

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
