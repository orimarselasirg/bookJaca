import java.lang.reflect.Array;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Library libraryList =  new Library();
        Book book1 = new Book("libro1", 10, 1);
        Book book2 = new Book("libro2", 15, 10);
        libraryList.addBooks(book1);
        libraryList.addBooks(book2);
        //System.out.println("libros: " + book1.stock);
        //book1.addStock(2);
        //book1.removeStock(5);
        libraryList.showTitlebook();

        System.out.println(libraryList);
        //libraryList.removeBooks(book1);
        libraryList.bookSale(1, "libro1");
        System.out.println(libraryList);
    }
}