
/**
 * Library class to manage an array of Book objects.
 */
public class Library {
    private Book[] books;
    private int count;
    private static final int MAX_BOOKS = 5;

    /**
     * Default constructor initializing the books array.
     */
    public Library() {
        this.books = new Book[MAX_BOOKS];
        this.count = 0;
    }

    /**
     * Adds a book to the library if there is space.
     *
     * @param  The book to add.
     * @return true if the book was added, false if the library is full.
     */
    public boolean addBook(Book book) {
        if (count < MAX_BOOKS) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully.");
            return true;
        } else {
            System.out.println("Library is full. Cannot add more books.");
            return false;
        }
    }

    /**
     * Removes a book from the library if it exists.
     *
     * @param  The book to remove.
     * @return true if the book was removed, false if not found.
     */
    public boolean removeBook(Book book) {
        for (int i = 0; i < count; i++) {
            if (books[i].equals(book)) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                System.out.println("Book removed successfully.");
                return true;
            }
        }
        System.out.println("Book not found. Cannot remove.");
        return false;
    }

    /**
     * Searches for a book by ISBN.
     *
     * @param ISBN The ISBN to search for.
     * @return The found book, or null if not found.
     */
    public Book searchByISBN(String ISBN) {
        for (int i = 0; i < count; i++) {
            if (books[i].getISBN().equals(ISBN)) {
                return books[i];
            }
        }
        return null;
    }

    /**
     * Displays all books in the library.
     */
    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("All books in the library:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + books[i].toString());
            }
        }
    }
}