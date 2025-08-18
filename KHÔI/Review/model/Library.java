import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Library {
    private final List<Book> books;
    
    public Library() {
        this.books = new ArrayList<>();
    }
    
    public Library(final List<Book> books) {
        this.books = new ArrayList<>(books); // Defensive copy
    }
    
    // Returns an unmodifiable view of the books list
    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }
    
    // Alternative: Return a defensive copy
    // public List<Book> getBooks() {
    //     return new ArrayList<>(books);
    // }
}