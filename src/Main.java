import java.lang.reflect.Array;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library libraryList =  new Library();
        Book book1 = new Book("EL ovni de belen", 10, 1);
        Book book2 = new Book("El tartaro", 15, 10);
        Book book3 = new Book("Por todos los dioses", 20, 10);

        libraryList.addBooks(book1);
        libraryList.addBooks(book2);
        //System.out.println("libros: " + book1.stock);
        //book1.addStock(2);
        //book1.removeStock(5);
        libraryList.showTitlebook();

        System.out.println(libraryList.toString());
        System.out.println("Que libro deseas pedir: ");
        String book =  scan.nextLine();
        libraryList.bookSale(11, book);
    }
}