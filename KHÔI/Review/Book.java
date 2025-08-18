public class Book {
    String title;
    String author;
    int numPages;

    Book() {
    }; // default constructor

    public Book(String t, String a, int p) {
        title = t;
        author = a;
        numPages = p;
    }

    public Book(String au, int page) {
        author = au;
        numPages = page;

    }

    public static void test() {
        Book myObj = new Book("a", "b", 2); // New book

        Book ob = new Book("test", 100);
        System.out.println(myObj.title);
        System.out.println("author: " + ob.author + "page : "+ ob.numPages);

    }
}
