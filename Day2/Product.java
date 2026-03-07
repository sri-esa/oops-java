package Day2;

public class Product {
    int productId;
    String name;
    int quantity;
    Product(int productId, String name, int quantity) {
        this.productId = productId;
        this.name = name;
        this.quantity = (quantity < 0) ? 0 : quantity;
    }
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 10);
        Product p2 = new Product(102, "Phone", -5);
        System.out.println("Product 1: " + p1.name + ", Quantity: " + p1.quantity);
        System.out.println("Product 2: " + p2.name + ", Quantity: " + p2.quantity);
    }
}
