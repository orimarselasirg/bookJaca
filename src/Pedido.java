public class Pedido {

    int price;
    int qty;
    String title;

    public Pedido(int price, int qty, String title) {
        this.price = price;
        this.qty = qty;
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getTitle() {
        return title;
    }
}
