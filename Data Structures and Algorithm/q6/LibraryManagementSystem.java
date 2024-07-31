import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagementSystem {
    private Book[] books;

    public LibraryManagementSystem(Book[] books) {
        this.books = books;
    }

    // Linear Search by Title
    public Book searchBookByTitleLinear(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search by Title (Assuming books array is sorted by title)
    public Book searchBookByTitleBinary(String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = title.compareToIgnoreCase(books[mid].getTitle());

            if (cmp == 0) {
                return books[mid];
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Initialize books with new titles and authors
        Book[] books = {
            new Book(1, "The Alchemist", "Paulo Coelho"),
            new Book(2, "The Hitchhiker's Guide to the Galaxy", "Douglas Adams"),
            new Book(3, "The Da Vinci Code", "Dan Brown")
        };

        // Sort books by title for binary search
        Arrays.sort(books, Comparator.comparing(Book::getTitle));

        LibraryManagementSystem lms = new LibraryManagementSystem(books);

        // Linear search
        System.out.println("Linear Search:");
        Book bookLinear = lms.searchBookByTitleLinear("The Da Vinci Code");
        if (bookLinear != null) {
            System.out.println("Found: " + bookLinear);
        } else {
            System.out.println("Book not found.");
        }

        // Binary search
        System.out.println("\nBinary Search:");
        Book bookBinary = lms.searchBookByTitleBinary("The Da Vinci Code");
        if (bookBinary != null) {
            System.out.println("Found: " + bookBinary);
        } else {
            System.out.println("Book not found.");
        }
    }
}
