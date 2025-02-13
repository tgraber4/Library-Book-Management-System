public class LibraryApp {

	public static void main(String[] args) {
		
		
		// Create Library and Books
		Library Ellis_Library = new Library();
		Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780333791035", 5.00);
		Book book2 = new Book("One Flew Over the Cuckoo's Nest", "Ken Kesey", "9780330235648", 9.18);
		Book book3 = new Book("1984", "George Orwell", "9780155658110", 2.24);
		Book book4 = new Book("2001: a Space Odyssey", "Arthur C. Clarke", "9781101664155", 8.99);
		
		//Adds 3 books to library
		Ellis_Library.addBook(book1);
		Ellis_Library.addBook(book2);
		Ellis_Library.addBook(book3);
		
		//Searches for book with specific ISBN
		String SearchingISBN = "9780330235648";
		System.out.println("The book with ISBN: " + SearchingISBN + " is " 
		+ Ellis_Library.searchByISBN(SearchingISBN).toString());
		
		//Attempts to remove 2 books
		Ellis_Library.removeBook(book4);
		Ellis_Library.removeBook(book2);
		
		//Displays all the books in the library
		Ellis_Library.displayBooks();
	}

}
