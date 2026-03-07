package Day3;

public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void purchase(int qty) {
        if (qty > 0 && stock >= qty) {
            stock -= qty;
        }
    }

    public int getStock() {
        return stock;
    }
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", 999.99, 10);
        System.out.println("Initial Stock: " + product.getStock());
        product.purchase(3);
        System.out.println("Stock after purchase: " + product.getStock());
    }
}
