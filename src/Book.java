public class Book {
    String title;
    int price;
    int stock;

    public Book() {
    }
    public Book(Book book) {
        this.title = book.title;
        this.stock = book.stock;
        this.price = book.price;
    }


    public Book(String title, int price, int stock) {
        this.title = title;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void addStock(int qty) {
        this.stock = this.stock + qty;
        System.out.println("desde el metodo: " + this.stock);
    }

    public void removeStock(int qty) {
        this.stock = this.stock - qty;
        System.out.println(this.stock);
    }

    @Override
    public boolean equals(Object obj) {
        Book objBook = new Book((Book)obj);
        return this.title.equals(objBook.title);
    }
}
