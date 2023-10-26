import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> libraryBooks;

    public Library() {
        this.libraryBooks = new ArrayList<>();
    }

    public Library(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public void addBooks(Book book) {
        this.libraryBooks.add(book);
    }

    public void showTitlebook(){
        for(var bookData: libraryBooks){
            System.out.println(bookData.title);
        }
    }

    public void removeBooks(Book book) {
        //List<Book> newBookList = new ArrayList<>();
        //for(var bookData: libraryBooks) {
        //    if(bookData.title != title) {
        //        newBookList.add((bookData));
        //    }
        //}
        //this.libraryBooks = newBookList;

        //System.out.println(this.libraryBooks);
        this.libraryBooks.remove(book);
    }

    public void bookSale(int qty, String title) {

        for(var bookData: libraryBooks) {
            if(bookData.title == title) {
                if(bookData.stock > 1) {
                    bookData.removeStock(qty);
                } else {
                    removeBooks(bookData);
                }
                Pedido pedidoNuevo = new Pedido(bookData.price, qty, bookData.title );
                System.out.println("Se vendio el libro: " + pedidoNuevo.getTitle() + " " + " por valor de: " + pedidoNuevo.getPrice());
            }
        }
    }

}
